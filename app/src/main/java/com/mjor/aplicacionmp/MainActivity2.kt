package com.mjor.aplicacionmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mjor.aplicacionmp.databinding.ActivityPelicula1Binding
import com.mjor.aplicacionmp.databinding.ActivityPelicula2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityPelicula2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPelicula2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cerrarVista(view: View){
        finish()
    }
}