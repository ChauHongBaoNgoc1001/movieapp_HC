package com.example.movieapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class dsPhim : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dsphim)

        // Khởi tạo dữ liệu..
        val layoutManager = GridLayoutManager(
            this,
            2
        ) // Cập nhật layoutManager để sử dụng GridLayoutManager(sawsp xếp dạng lưới) với spanCount là 2

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val adapter = Item(this) // khởi tạo adapter
        recyclerView.adapter = adapter

        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)

        val myDataset = Datasource().DSPhim()
            .toMutableList() //Khởi tạo danh sách phim từ nguồn dữ liệu Datasource().DSPhim(
        adapter.updateData(myDataset)
    }
}
