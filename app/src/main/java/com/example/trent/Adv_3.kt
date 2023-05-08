package com.example.trent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Adv_3 : AppCompatActivity() {
    lateinit var zx_img : ImageView
    lateinit var zx_txt : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adv3)
        zx_img = findViewById(R.id.img_ad_3)
        zx_txt = findViewById(R.id.ad_3_txt)

    }
}