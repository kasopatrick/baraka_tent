package com.example.trent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class suppliesActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var supplyAdapter: SuppliesAdapter
    lateinit var supplyList: ArrayList<Supplies>
    ;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supplies)
        recyclerView = findViewById(R.id.rcycleSupplies)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        supplyList = ArrayList()

        supplyList.add(Supplies(R.drawable.fressian,"Fressian","This is a fressian cow which we sell it ranging from ksh.60000 to 120000,depending on it's status"))
        supplyList.add(Supplies(R.drawable.cheesse,"cheesse","we sell cheese depending on it's quality and size, the prices ranges from ksh.300  to ksh.7000 depending on the quality"))
        supplyList.add(Supplies(R.drawable.milk,"milk","we sell milk starting from ksh.60 per litre"))
        supplyList.add(Supplies(R.drawable.yoghurt,"yoghurt","we sell yoghurt starting from ksh.90 per half a litre"))
        supplyList.add(Supplies(R.drawable.calf,"calf","This is a fressian calf which we sell it ranging from ksh.10000 to 30000,depending on it's status and age"))
        supplyList.add(Supplies(R.drawable.butter,"butter","we sell butter depending on it's quality and size, the prices ranges from ksh.300  to ksh.7000 depending on the quality"))
        supplyList.add(Supplies(R.drawable.ghee,"ghee","we sell ghee depending on it's quality and size, the prices ranges from ksh.300  to ksh.7000 depending on the quality"))
        supplyList.add(Supplies(R.drawable.mala,"fermented milk","we sell fermented milk starting from ksh.60 per half a litre"))

        supplyAdapter = SuppliesAdapter(supplyList)
        recyclerView.adapter = supplyAdapter





    }
}