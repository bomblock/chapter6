package com.example.chapter6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter6.databinding.ActivityMainBinding
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener{
            start()
        }
        binding.stoptButton.setOnClickListener {
            stop()
        }
        binding.pauseButton.setOnClickListener {
            pause()
        }
        binding.lapButton.setOnClickListener {
            lap()
        }


    }

    private fun start(){

    }

    private fun pause(){

    }

    private  fun  stop(){

    }
    private  fun lap(){

    }

}