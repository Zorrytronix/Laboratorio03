package com.enrique.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var five: ImageView
    private lateinit var ten: ImageView
    private lateinit var quarter: ImageView
    private lateinit var dollar: ImageView
    private lateinit var Amount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        five.setOnClickListener {add(0.05)}
        ten.setOnClickListener {add(0.10)}
        quarter.setOnClickListener {add(0.25)}
        dollar.setOnClickListener {add(1.0)}

    }

    private fun bind () {
        five = findViewById(R.id.imageMoney5)
        ten = findViewById(R.id.imageView10)
        quarter = findViewById(R.id.imageMoney25)
        dollar = findViewById(R.id.imageMoneyDollar)
        Amount = findViewById(R.id.Amount)


    }

    private fun add(total: Double){
        var moneyTotal: Double

        moneyTotal = total

        moneyTotal.toString()


    }

}