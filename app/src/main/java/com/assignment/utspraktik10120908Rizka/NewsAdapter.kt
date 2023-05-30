package com.assignment.utspraktik10120908Rizka

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

/**
 * Tanggal Pengerjaan : 30/05/2023
 * NIM : 10120908
 * Nama : Rizka Ghinna Auliya
 * Kelas : IF-10
 * */

class NewsAdapter(private val currentList: List<NewsModel>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(item = currentList[position], currentList.size)
    }

    override fun getItemCount(): Int = currentList.size

    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        fun bind(item: NewsModel, size: Int) {
            itemView.let {
                val title = it.findViewById<MaterialTextView>(R.id.tvTitle)
                val date = it.findViewById<MaterialTextView>(R.id.tvDate)

                title.text = item.title
                date.text = item.date
            }
        }
    }

}