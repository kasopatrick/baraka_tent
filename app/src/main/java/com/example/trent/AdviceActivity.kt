package com.example.trent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AdviceActivity : AppCompatActivity() {
    lateinit var edt_img:ImageView
    lateinit var ad_txt:TextView
    lateinit var ad_btn_1:Button
    lateinit var ad_btn_2:Button
    lateinit var ad_btn_3:Button
    lateinit var ad_btn_4:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advicem)
        edt_img = findViewById(R.id.avdimg)
        ad_txt = findViewById(R.id.txtspecify)
        ad_btn_1 = findViewById(R.id.spf_1)
        ad_btn_2 = findViewById(R.id.spf_2)
        ad_btn_3 = findViewById(R.id.spf_3)
        ad_btn_4 = findViewById(R.id.spf_4)

        ad_btn_1.setOnClickListener {
            var uplift = Intent(this,Adv_1Activity::class.java)
            startActivity(uplift)
        }
        ad_btn_2.setOnClickListener {
            var songesha = Intent(this,Adv_2Activity::class.java)
            startActivity(songesha)

        }
        ad_btn_3.setOnClickListener {
            var move = Intent(this,Adv_3Activity::class.java)
            startActivity(move)
        }
        ad_btn_4.setOnClickListener {
            var beba = Intent(this,Adv_4Activity::class.java)
            startActivity(beba)
        }

    }
}