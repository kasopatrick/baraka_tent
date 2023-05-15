package com.example.trent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Adv_2Activity : AppCompatActivity() {
    lateinit var rt_img : ImageView
    lateinit var rt_txt :TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adv2)
        rt_img = findViewById(R.id.advimg_2)
        rt_txt = findViewById(R.id.txt_2_2)

    }
}