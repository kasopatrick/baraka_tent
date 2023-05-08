package com.example.trent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Adv_1 : AppCompatActivity() {
    lateinit var edtpic : ImageView
    lateinit var edttitlead : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adv1)
        edtpic = findViewById(R.id.fressian)
        edttitlead = findViewById(R.id.adptitle)

    }
}