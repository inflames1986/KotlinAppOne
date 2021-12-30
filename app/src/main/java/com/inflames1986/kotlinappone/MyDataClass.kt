package com.inflames1986.kotlinappone

data class MyDataClass(val serial: String, val name: String, val age: Int) {
    fun getNameUpperCase() = name.uppercase()
}
