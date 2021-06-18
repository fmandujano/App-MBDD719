package com.sae.taller.app2021_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText


//variable que contiene el numero de clics en el botón
var contador:Byte = 120


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Appify", "set content view")
        setContentView(R.layout.activity_main)

    }
}