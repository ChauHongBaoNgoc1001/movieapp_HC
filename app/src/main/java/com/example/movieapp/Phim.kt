package com.example.movieapp

data class Phim(
    val title: String, //tiêu đề
    val overview: String,// giới thiệu
    val posterImageUrl: String,
    val Director: String, // đạo diễn
    val time: String,
    val Category: String,// thể loại
    val Performer: String
) // diễn viên
