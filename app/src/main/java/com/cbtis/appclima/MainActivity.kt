package com.cbtis.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)


        val ciudad = intent.getStringExtra("com.cbtis.appclima.ciudades.CIUDAD")


        if(Network.hayRed(this)){
            // ejecutar solicitud HTTP
        solicitudHTTPVolley("https://api.openweathermap.org/data/2.5/weather?id="+ciudad+"&appid=2dc9c9cad42415e73767d224608395ed&units=metric&lang=es")

        }else{
            // mostrar mensaje de error
            Toast.makeText(this, "No hay red", Toast.LENGTH_SHORT).show()
        }
            /*
        Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()//en caso de error mover





        val ciudadmx = Ciudad("Ciudad de México", 15, "Soleado")
        val ciudadBerlin = Ciudad("Ciudad de Berlin", 30, "Cielo despejado")
        val ciudadChetumal = Ciudad("Ciudad de Chetumal", 25, "Cielo Nublado")
        val ciudadCancun = Ciudad("Ciudad de Cancun", 32, "Nublado")
        val ciudadMorelos = Ciudad("Ciudad de Morelos", 19, "Cielo despejado")
        val ciudadTulum = Ciudad("Ciudad de Tulum", 37, "Soleado")


        if (ciudad=="ciudad-mexico"){
            //mostrar info
            tvCiudad?.text = ciudadmx.nombre
            tvGrados?.text = ciudadmx.grados.toString()+"°"
            tvEstatus?.text = ciudadmx.estatus

        }else if (ciudad=="ciudad-berlin"){
            //mostrar info
            tvCiudad?.text = ciudadBerlin.nombre
            tvGrados?.text = ciudadBerlin.grados.toString()+"°"
            tvEstatus?.text = ciudadBerlin.estatus

        }else if (ciudad=="ciudad-chetumal"){
            //mostrar info
            tvCiudad?.text = ciudadChetumal.nombre
            tvGrados?.text = ciudadChetumal.grados.toString()+"°"
            tvEstatus?.text = ciudadChetumal.estatus

        }else if (ciudad=="ciudad-cancun"){
            //mostrar info
            tvCiudad?.text = ciudadCancun.nombre
            tvGrados?.text = ciudadCancun.grados.toString()+"°"
            tvEstatus?.text = ciudadCancun.estatus

        }else if (ciudad=="ciudad-morelos"){
            //mostrar info
            tvCiudad?.text = ciudadMorelos.nombre
            tvGrados?.text = ciudadMorelos.grados.toString()+"°"
            tvEstatus?.text = ciudadMorelos.estatus

        }else if (ciudad=="ciudad-tulum"){
            //mostrar info
            tvCiudad?.text = ciudadTulum.nombre
            tvGrados?.text = ciudadTulum.grados.toString()+"°"
            tvEstatus?.text = ciudadTulum.estatus

        }else{
            Toast.makeText(this, "No se encuentra la informacion", Toast.LENGTH_SHORT).show()
        }
            */
    }

    private fun solicitudHTTPVolley(url: String){
        val queue = Volley.newRequestQueue(this)

        val solicitud = StringRequest(Request.Method.GET, url, Response.Listener<String>{
            response ->
            try {
                Log.d("solicitudHTTPVolley", response)

                val gson = Gson ()

                val ciudad = gson.fromJson(response, Ciudad::class.java)
                tvCiudad?.text = ciudad.name
                tvGrados?.text = ciudad.main?.temp.toString()+"°"
                tvEstatus?.text = ciudad.weather?.get(0)?.description

            }catch (e: Exception){

            }
        }, Response.ErrorListener { })
                queue.add(solicitud)
    }


}