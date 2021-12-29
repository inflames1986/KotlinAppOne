package com.inflames1986.kotlinappone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var btn1: Button? = null
    private var btn2: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button1)
        btn1?.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                    this@MainActivity,
                    "Something doing!",
                    Toast.LENGTH_SHORT
            ).show()
        })

        btn2 = findViewById(R.id.button2)
        btn2?.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                    this@MainActivity,
                    "Something doing!!!!!!",
                    Toast.LENGTH_SHORT
            ).show()
        })
    }
}