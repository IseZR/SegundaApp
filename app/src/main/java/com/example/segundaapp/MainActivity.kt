package com.example.segundaapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.segundaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var dataBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(dataBinding?.root)

        val myString = intent.getStringExtra("datos")
        dataBinding?.txtDato?.text = myString
        Toast.makeText(this, myString, Toast.LENGTH_SHORT).show()
    }
}