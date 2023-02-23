package com.mjor.aplicacionmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mjor.aplicacionmp.databinding.ActivityMainPelicula4Binding

class MainActivityPelicula4 : AppCompatActivity() {
    private lateinit var binding: ActivityMainPelicula4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPelicula4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrarVista(view: View){
        finish()
    }
}