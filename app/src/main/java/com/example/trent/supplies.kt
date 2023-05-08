package com.example.trent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class supplies : AppCompatActivity() {
    lateinit var imagecow:ImageView
    lateinit var textone:TextView
    lateinit var imagemilk:ImageView
    lateinit var texttwo:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supplies)
        imagecow = findViewById(R.id.Image1)
        textone = findViewById(R.id.text1)
        imagemilk = findViewById(R.id.Image_2)
        texttwo = findViewById(R.id.text_2)
    }
}