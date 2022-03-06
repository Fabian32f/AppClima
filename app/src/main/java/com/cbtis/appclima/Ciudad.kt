package com.cbtis.appclima

class Ciudad (name: String, wheater:ArrayList<Weather>, main:Main) {
    var name: String = ""
    var wheater: ArrayList<Weather>? = null
    var main: Main? = null

    init {
        this.name=name
        this.wheater=wheater
        this.main=main
    }


}