package com.example.myroomsatu.view.route

interface DestinasiNavigasi {
    /**
     * nama unik untuk menentukan jalur composable
     */
    val route: String

    /** string resources id yang berisi judul yang akan ditampilkan
     * di layar halaman
     */
    val titleRes: Int
}