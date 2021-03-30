package com.robert.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AnimalInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)
//        val bundle:Bundle? = intent.extras
//        val name = bundle?.getString("name")
//        val  desc = bundle?.getString("desc")
//        val image = bundle?.getInt("image")
//        val img = findViewById<ImageView>(R.id.Image)
//        val txt1 = findViewById<TextView>(R.id.text1)
//        val txt2 = findViewById<TextView>(R.id.text3)
//        img.setImageResource(image!!)
//        txt1.text = name
//        txt2.text = desc
    }
}