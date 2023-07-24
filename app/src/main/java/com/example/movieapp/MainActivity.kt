package com.example.movieapp

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val xem = findViewById<Button>(R.id.xemDS)
        val thoatUD = findViewById<Button>(R.id.thoatUD)
        var hienThi = findViewById<TextView>(R.id.hienthi)

        val username = intent.getStringExtra("username")
        val hien = "Welcome $username to the movie-watching application!"
        hienThi.text = hien

        xem.setOnClickListener {
            val intent = Intent(this, dsPhim::class.java)
            this.startActivity(intent) // chuyển màn hình
        }

        thoatUD.setOnClickListener {
            // Tạo dialog để gán với layout
            val builder = AlertDialog.Builder(this)
            // Thành lập dialog
            // Bước 1 Tạo layout
            val inflater = this.layoutInflater
            val view = inflater.inflate(R.layout.dialog_thoat, null)
            builder.setView(view)
            // Bước 2 - Ánh xạ
            val dltThoat = view.findViewById<Button>(R.id.dltthoat)
            val dltcancel = view.findViewById<Button>(R.id.dltcencel)
            // Tạo AlertDialog
            val alertDialog = builder.create()
            alertDialog.show()

            dltThoat.setOnClickListener {
                finishAffinity() // Kết thúc tất cả các hoạt động và thoát khỏi ứng dụng
            }

            dltcancel.setOnClickListener {
                alertDialog.dismiss() // Đóng dialog khi nhấp vào nút "Cancel"
            }
        }
    }
}