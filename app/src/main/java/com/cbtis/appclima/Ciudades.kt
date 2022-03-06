package com.cbtis.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.cbtis.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bMexico = findViewById<Button>(R.id.bMexico)
        val bBerlin = findViewById<Button>(R.id.bBerlin)
        val bChetumal = findViewById<Button>(R.id.bChetumal)
        val bCancun = findViewById<Button>(R.id.bCancun)
        val bMorelos = findViewById<Button>(R.id.bMorelos)
        val bTulum = findViewById<Button>(R.id.bTulum)


        bMexico.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3530597")
            startActivity(intent)
        })

        bBerlin.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-berlin")
            startActivity(intent)
        })

        bChetumal.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-chetumal")
            startActivity(intent)
        })

        bCancun.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-cancun")
            startActivity(intent)
        })

        bMorelos.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-morelos")
            startActivity(intent)
        })

        bTulum.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-tulum")
            startActivity(intent)
        })




    }
}