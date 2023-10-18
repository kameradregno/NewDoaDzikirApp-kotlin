package com.example.newdoadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newdoadzikirapp.adapter.DzikirDoaAdapter
import com.example.newdoadzikirapp.databinding.ActivityDzikirDanDoaHarianBinding
import com.example.newdoadzikirapp.model.DataDzikirDoa

class DzikirDanDoaHarianActivity : AppCompatActivity() {


    lateinit var binding: ActivityDzikirDanDoaHarianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirDanDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Dan Doa Harian"

        binding.apply {
            rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this@DzikirDanDoaHarianActivity)
            rvDzikirDoaHarian.adapter = DzikirDoaAdapter(DataDzikirDoa.listDoaHarian)
        }



    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}