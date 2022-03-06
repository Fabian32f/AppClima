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

        val bMexico = findViewById<Button>(R.id.bMexico) //Shanghai
        val bBerlin = findViewById<Button>(R.id.bBerlin)
        val bChetumal = findViewById<Button>(R.id.bChetumal)
        val bCancun = findViewById<Button>(R.id.bCancun)
        val bMorelos = findViewById<Button>(R.id.bMorelos)
        val bTulum = findViewById<Button>(R.id.bTulum)
        val bShanghai = findViewById<Button>(R.id.bShanghai)


        bMexico.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3530597")
            startActivity(intent)
        })

        bBerlin.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "2950159")
            startActivity(intent)
        })

        bChetumal.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3531023")
            startActivity(intent)
        })

        bCancun.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3531673")
            startActivity(intent)
        })

        bMorelos.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3995398")
            startActivity(intent)
        })

        bTulum.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "3515040")
            startActivity(intent)
        })

        bShanghai.setOnClickListener (View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "1796236")
            startActivity(intent)
        })




    }
}