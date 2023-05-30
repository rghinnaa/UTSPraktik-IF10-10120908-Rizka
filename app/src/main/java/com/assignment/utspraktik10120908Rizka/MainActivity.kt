package com.assignment.utspraktik10120908Rizka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

/**
 * Tanggal Pengerjaan : 30/05/2023
 * NIM : 10120908
 * Nama : Rizka Ghinna Auliya
 * Kelas : IF-10
 * */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvRegister = findViewById<RecyclerView>(R.id.rvRegister)
        val rvNews = findViewById<RecyclerView>(R.id.rvNews)

        rvRegister.adapter = RegisterAdapter(DataCollection.registerData)
        rvNews.adapter = NewsAdapter(DataCollection.newsData)

    }
}