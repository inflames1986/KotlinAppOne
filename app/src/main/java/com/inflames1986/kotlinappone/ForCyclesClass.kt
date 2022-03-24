package com.inflames1986.kotlinappone

import android.util.Log

class ForCyclesClass {

    val a: Int = 100
    val b: Int = 50

    fun whenTesting(value: String): Int {

        var arifmRes = 1

        when (value) {

            "aaa" -> {
                arifmRes = a + b
            }

            "bbb" -> {
                arifmRes = a - b
            }

            "ccc" -> {
                arifmRes = a * b
            }
        }
        return arifmRes
    }

    fun whenTesting2(): Int {

        var arifmRes = 1
        var value = 1

        while (value <= 100) {
            value *= 2
            arifmRes *= 4
        }
        return arifmRes
    }

    fun whenTesting3() {

        val list = listOf(1, 2, 3, 4, 5, 6, 7)
        for (one in list) {
            Log.d("myLogs", "$one")
        }
    }
}