package com.mjor.aplicacionmp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mjor.aplicacionmp.databinding.ActivityMainBinding
import com.mjor.aplicacionmp.databinding.ActivityPelicula2Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun cambiarPelicula1(view: View){
        val intent = Intent(this, Pelicula1Activity::class.java)
        startActivity(intent)
    }
    fun cambiarPelicula2(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
    fun cambiarPelicula3(view: View){
        val intent = Intent(this, MainActivityPelicula3::class.java)
        startActivity(intent)
    }
    fun cambiarPelicula4(view: View){
        val intent = Intent(this, MainActivityPelicula4::class.java)
        startActivity(intent)
    }

}
