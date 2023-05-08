package com.example.trent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mTitle:TextView
    lateinit var dimage:ImageView
    lateinit var dText: TextView
    lateinit var btStart:Button
    lateinit var dimage_2:ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTitle = findViewById(R.id.nTvTitle)
        dimage = findViewById(R.id.Image_1)
        dText = findViewById(R.id.edtText)
        btStart = findViewById(R.id.mBtnStart)
        dimage_2 = findViewById(R.id.Image_2)

        btStart.setOnClickListener {
            var tembea = Intent(this,Users::class.java)
            startActivity(tembea)
        }





    }
}