package com.inflames1986.kotlinappone

object NameCopy {
    val firstPersonName = MyDataClass("12345", "Ivan", 90)
    val secondPersonName = firstPersonName.copy()
    var secondname = secondPersonName.name
}