package com.mjor.aplicacionmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mjor.aplicacionmp.databinding.ActivityPelicula1Binding

class Pelicula1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPelicula1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPelicula1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrarVista(view: View){
        finish()
    }
}