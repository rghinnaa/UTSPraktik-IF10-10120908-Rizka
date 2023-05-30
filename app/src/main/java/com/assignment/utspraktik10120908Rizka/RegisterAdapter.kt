package com.assignment.utspraktik10120908Rizka

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

/**
 * Tanggal Pengerjaan : 30/05/2023
 * NIM : 10120908
 * Nama : Rizka Ghinna Auliya
 * Kelas : IF-10
 * */

class RegisterAdapter(private val currentList: List<RegisterModel>) : RecyclerView.Adapter<RegisterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_register, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(item = currentList[position], currentList.size)
    }

    override fun getItemCount(): Int = currentList.size

    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        fun bind(item: RegisterModel, size: Int) {
            itemView.let {
                val image = it.findViewById<AppCompatImageView>(R.id.ivIcon)
                val title = it.findViewById<MaterialTextView>(R.id.tvTitleIcon)
                val view = it.findViewById<View>(R.id.vLine)

                image.setImageResource(item.image)
                title.text = item.title

                view.isVisible = adapterPosition != size-1
            }
        }
    }

}