package com.example.newdoadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newdoadzikirapp.R
import com.example.newdoadzikirapp.adapter.DzikirDoaAdapter
import com.example.newdoadzikirapp.databinding.ActivityDzikirSetiapSaatBinding
import com.example.newdoadzikirapp.model.DataDzikirDoa

class DzikirSetiapSaatActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirSetiapSaatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirSetiapSaatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Setiap Saat"

        binding.apply {
            rvSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirSetiapSaatActivity)
            rvSetiapSaat.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}