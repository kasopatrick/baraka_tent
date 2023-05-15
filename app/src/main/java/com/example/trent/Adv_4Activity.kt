package com.example.trent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Adv_4Activity : AppCompatActivity() {
    lateinit var cv_img : ImageView
    lateinit var cv_txt : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adv4)
        cv_img = findViewById(R.id.ad_4_img)
        cv_txt = findViewById(R.id.txt_4_4)

    }
}