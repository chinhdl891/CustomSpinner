package com.example.customspinner

import android.os.Bundle
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import com.example.customspinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        mainBinding.spinner.adapter = CustomAdapter(this, 0, listLabale())


    }

    private fun listLabale(): MutableList<String> {
        return arrayListOf("Java", "Kotlin", "#C")
    }



}