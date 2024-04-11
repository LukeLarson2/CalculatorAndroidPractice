package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var displayField : TextView? = null
    private var calculation = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.main_toolbar))

        displayField = findViewById(R.id.output_field)


    }

    private fun compute(nextVal: Int, opp: String) {
        when(opp) {
            "+" -> calculation += nextVal
            "-" -> calculation -= nextVal
            "*" -> calculation *= nextVal
            "/" -> calculation /= nextVal
            "CLR" -> calculation = 1
        }
        displayField?.text = calculation.toString()
    }

    fun onDigit(view: View) {

        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}

