package com.example.newdoadzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newdoadzikirapp.R
import com.example.newdoadzikirapp.adapter.DzikirDoaAdapter
import com.example.newdoadzikirapp.databinding.ActivityDzikirPetangBinding
import com.example.newdoadzikirapp.model.DataDzikirDoa

class DzikirPetangActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirPetangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Petang"

        binding.apply {
            rvDzikirPetang.layoutManager = LinearLayoutManager(this@DzikirPetangActivity)
            rvDzikirPetang.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPetang)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}