package com.cbtis.appclima

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity

class Network {

    companion object {
        fun hayRed(activity: AppCompatActivity): Boolean {
            val connecttivityManager =
                activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connecttivityManager.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
    }
}