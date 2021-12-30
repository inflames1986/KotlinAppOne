package com.inflames1986.kotlinappone

open class MyCopyClass {

    var arg1 = doCopy()

    fun doCopy(): String {

        val mydata = MyDataClass("33414ae", "Victor", 46)
        val copydata = mydata.copy()

        return copydata.name
    }
}