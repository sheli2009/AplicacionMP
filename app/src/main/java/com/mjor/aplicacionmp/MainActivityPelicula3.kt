package com.mjor.aplicacionmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mjor.aplicacionmp.databinding.ActivityMainPelicula3Binding

class MainActivityPelicula3 : AppCompatActivity() {
    private lateinit var binding: ActivityMainPelicula3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPelicula3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrarVista(view: View){
        finish()
    }
}