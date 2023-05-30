package com.assignment.utspraktik10120908Rizka

/**
 * Tanggal Pengerjaan : 30/05/2023
 * NIM : 10120908
 * Nama : Rizka Ghinna Auliya
 * Kelas : IF-10
 * */

object DataCollection {
    val registerData: List<RegisterModel> = listOf(
        RegisterModel(
            R.drawable.ic_info,
            "Info Sekolah PPDB"
        ),
        RegisterModel(
            R.drawable.ic_social,
            "Sosialisasi PPDB"
        ),
        RegisterModel(
            R.drawable.ic_register_1,
            "Pendaftaran PPDB Tahap 1"
        ),
        RegisterModel(
            R.drawable.ic_announcement_1,
            "Pengumuman PPDB Tahap 1"
        ),
        RegisterModel(
            R.drawable.ic_hotline,
            "Hotline"
        )
    )

    val newsData: List<NewsModel> = listOf(
        NewsModel(
            "PPDB SMA/ SMK 2022, Ridwan Kamil: PPDB di Jawa Barat Semakin Adil dan Andal",
            "15 jam yang lalu"
        ),
        NewsModel(
            "Persiapan PPDB Jabar Tahun 2021 Sudah Matang",
            "4 Juni 2022"
        ),
        NewsModel(
            "Pelaksana Teknis PPDB Harus Evaluasi Diri",
            "24 Mei 2022"
        ),
        NewsModel(
            "Masih ditemukan 'Blank Spot' dalam Proses PPDB Kabupaten Cianjur",
            "24 Mei 2022"
        ),
        NewsModel(
            "Bupati Purwakarta Hadiri Pembukaan Masa Pengenalan Lingkungan Sekolah",
            "19 Juli 2022"
        )
    )
}