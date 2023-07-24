package com.example.movieapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

data class Item(private val context: Context) :
    RecyclerView.Adapter<Item.ItemViewHolder>() { // kế thừa từ RecyclerView.Adapter và có tham số hóa bởi ItemViewHolder.

    private val dataset: MutableList<Phim> = mutableListOf()

    fun updateData(data: MutableList<Phim>) {
        dataset.clear()
        dataset.addAll(data)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {  // Nó sẽ khởi tạo giao diện (layout) cho mỗi item bằng cách sử dụng LayoutInflater và trả về một phiên bản mới của ItemViewHolder.
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        Glide.with(context)
            .load(item.posterImageUrl)
            .into(holder.imageView)

        holder.textView.text = item.title

        holder.itemView.setOnClickListener {
            val intent = Intent(context, detail::class.java) // chuyển trang
            intent.putExtra("MOVIE_TITLE", item.title)
            intent.putExtra("MOVIE_OVERVIEW", item.overview)
            intent.putExtra("MOVIE_POSTER_URL", item.posterImageUrl)
            intent.putExtra("Director", item.Director)
            intent.putExtra("time", item.time)
            intent.putExtra("Category", item.Category)
            intent.putExtra("Performer", item.Performer)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int { //trả về số lượng các item trong danh sách (tức số lượng phim).
        return dataset.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val textView: TextView = itemView.findViewById(R.id.textTitle)
    }
}

