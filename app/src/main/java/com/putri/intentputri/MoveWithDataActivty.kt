package com.putri.intentputri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivty : AppCompatActivity() {
    private lateinit var tvDataReceived:  TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data_activty)

        tvDataReceived = findViewById(R.id.tv_data_received)
        DataReceived()

    }

    private fun DataReceived() {
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val alamat = bundle?.getString("Alamat")

        tvDataReceived.text = nama + " " + alamat
    }

}



