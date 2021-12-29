package com.inflames1986.kotlinappone

class Repository {

    private val weatherList: List<Weather>
    private val otherList = arrayListOf<Weather>(Weather("Yalta", 30))

    init {
        weatherList = arrayListOf(Weather("Sevastopol", 25), Weather("Simferopol", 22))
        otherList.add(Weather("Alushta", 31))
    }
}