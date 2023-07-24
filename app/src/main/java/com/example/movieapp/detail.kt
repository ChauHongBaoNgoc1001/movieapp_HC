package com.example.movieapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class detail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        var posterUrl = intent.getStringExtra("MOVIE_POSTER_URL")
        var imageView: ImageView = findViewById(R.id.detail_img)
        Picasso.get().load(posterUrl).into(imageView)

        var text = intent.getStringExtra("MOVIE_TITLE")
        var textView: TextView = findViewById(R.id.detail_Title)
        textView.text = text.toString()// GỌI ĐỂ HIỂN THỊ

        var text1 = intent.getStringExtra("MOVIE_OVERVIEW")
        var textView1: TextView = findViewById(R.id.detail_Overview)
        textView1.text = text1.toString()// GỌI ĐỂ HIỂN THỊ

        var daodien = intent.getStringExtra("Director")
        var Director: TextView = findViewById(R.id.detail_Director)
        Director.text = daodien.toString()// GỌI ĐỂ HIỂN THỊ

        var tGian = intent.getStringExtra("time")
        var time: TextView = findViewById(R.id.detail_time)
        time.text = tGian.toString()// GỌI ĐỂ HIỂN THỊ

        var theLoai = intent.getStringExtra("Category")
        var Category: TextView = findViewById(R.id.detail_Category)
        Category.text = theLoai.toString()// GỌI ĐỂ HIỂN THỊ

        var dienVien = intent.getStringExtra("Performer")
        var Performer: TextView = findViewById(R.id.detail_Performer)
        Performer.text = dienVien.toString()// GỌI ĐỂ HIỂN THỊ

        val Ten = findViewById<EditText>(R.id.user)
        val comment = findViewById<EditText>(R.id.cmt)
        val DanhSach = findViewById<ListView>(R.id.list_cmt)
        val btnComment = findViewById<Button>(R.id.btn_cmt)

        val danhsach: MutableList<ItemListView> = mutableListOf()
        val adapter: CustomListView = CustomListView(this@detail, R.layout.item_listview, danhsach)

        DanhSach.adapter = adapter

        btnComment.setOnClickListener {
            val cmt = comment.text.toString()
            val ten = Ten.text.toString()

            if (ten.isNotEmpty() && cmt.isNotEmpty()) {
                val userInfo = ItemListView(ten, cmt)

                danhsach.add(userInfo)
                adapter.notifyDataSetChanged()

                comment.text.clear()
                Ten.text.clear()
            } else {
                Toast.makeText(this, "Please provide complete information.", Toast.LENGTH_SHORT)
                    .show() // vui lòng nhập đủ thông tin
            }
        }
    }
}



