package com.geektech.lesson5kurs3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.lesson5kurs3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{

    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(R.id.container,FirstFragment()).commit()
        }
    }
}


