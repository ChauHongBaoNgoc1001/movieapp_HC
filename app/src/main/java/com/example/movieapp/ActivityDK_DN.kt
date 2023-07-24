package com.example.movieapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityDK_DN : AppCompatActivity() {
    // Khai báo biến rỗng lưu thông tin  tạm thời mk và tên
    private var registeredUsername: String = ""
    private var registeredPassword: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dk_dn)

        val name = findViewById<EditText>(R.id.name)
        val pass = findViewById<EditText>(R.id.pass)
        val dangKi = findViewById<Button>(R.id.dangKi)
        val dangNhap = findViewById<Button>(R.id.dangNhap)

        dangKi.setOnClickListener {
            // Tạo dialog để gán với layout
            val builder = AlertDialog.Builder(this)
            // Thiết lập dialog
            val inflater = this.layoutInflater
            val view = inflater.inflate(R.layout.dialog_dk, null)
            builder.setView(view)

            val dialogName = view.findViewById<EditText>(R.id.dialogName)
            val dialogPass = view.findViewById<EditText>(R.id.dialogPass)
            val dialogDangKi = view.findViewById<Button>(R.id.dialogdangki)
            val dialogCancel = view.findViewById<Button>(R.id.cancel)

            val eyeDialog = view.findViewById<ImageView>(R.id.eyedialog)

            eyeDialog.setOnClickListener {
                if (dialogPass.inputType == InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {// kiểu hnhaapj liệu băằng văn bản
                    // Nếu hiện mật khẩu, thay đổi thành ẩn mật khẩu
                    dialogPass.inputType =
                        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                    eyeDialog.setImageResource(R.drawable.eye)  // Thay đổi hình ảnh của ImageView
                } else {
                    // Nếu ẩn mật khẩu, thay đổi thành hiển thị chữ
                    dialogPass.inputType =
                        InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                    eyeDialog.setImageResource(R.drawable.eyean) // Thay đổi hình ảnh của ImageView
                }
                dialogPass.setSelection(dialogPass.text.length) // Di chuyển con trỏ của EditText về cuối văn bản
            }

            // Tạo AlertDialog
            val alertDialog = builder.create()
            alertDialog.show()

            dialogDangKi.setOnClickListener {
                val username = dialogName.text.toString()
                val password = dialogPass.text.toString()

                if (username.isNotEmpty() && password.isNotEmpty()) { // kiểm tra rỗng
                    registeredUsername = username
                    registeredPassword = password

                    // Hiển thị thông tin đăng ký trong Activity
                    name.setText("$registeredUsername")
                    pass.setText("$registeredPassword")

                    Toast.makeText(this, "Account registration successful!", Toast.LENGTH_SHORT)
                        .show()// đk tài khoản thành công
                    alertDialog.dismiss() // đóng dialog
                } else {
                    Toast.makeText(
                        this,
                        "Please enter your username and password.", // vui lòng nhập mk
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

            dialogCancel.setOnClickListener {
                alertDialog.dismiss() // đóng dialog
            }
        }

        val eye = findViewById<ImageView>(R.id.eye)

        eye.setOnClickListener {
            if (pass.inputType == InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                // Nếu hiện mật khẩu, thay đổi thành ẩn mật khẩu
                pass.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                eye.setImageResource(R.drawable.eye)  // Thay đổi hình ảnh của ImageView
            } else {
                // Nếu ẩn mật khẩu, thay đổi thành hiển thị chữ
                pass.inputType =
                    InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                eye.setImageResource(R.drawable.eyean) // Thay đổi hình ảnh của ImageView
            }
            pass.setSelection(pass.text.length) // Di chuyển con trỏ của EditText về cuối văn bản
        }

        dangNhap.setOnClickListener {
            val username = name.text.toString()
            val password = pass.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter your login name and password.", //"Vui lòng nhập tên đăng nhập và mật khẩu"
                    Toast.LENGTH_SHORT
                ).show()
            } else if (username == registeredUsername && password == registeredPassword) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("username", username) // truyền dữ liệu
                startActivity(intent) // chuyển màn hình
            } else {
                Toast.makeText(
                    this,
                    "Incorrect username or password.",// Tên đăng nhập hoặc mật khẩu không đúng
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
