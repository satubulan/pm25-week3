package com.ayu.pm25_week3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.background)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val input = findViewById<TextInputEditText>(R.id.inputNama)
        val button = findViewById<Button>(R.id.buttonNama)
        val hasil = findViewById<TextView>(R.id.hasilNama)
        val foto = findViewById<ImageView>(R.id.fotoProfile)

        button.setOnClickListener {
            val nama = input.text.toString()
            hasil.text = "Hello, $nama!"
            foto.visibility = View.VISIBLE
        }

    }
}