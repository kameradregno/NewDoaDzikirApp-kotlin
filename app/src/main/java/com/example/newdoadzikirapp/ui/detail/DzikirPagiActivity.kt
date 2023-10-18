package com.example.newdoadzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newdoadzikirapp.R
import com.example.newdoadzikirapp.adapter.DzikirDoaAdapter
import com.example.newdoadzikirapp.databinding.ActivityDzikirPagiBinding
import com.example.newdoadzikirapp.model.DataDzikirDoa

class DzikirPagiActivity : AppCompatActivity() {

    lateinit var binding: ActivityDzikirPagiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi"

        binding.apply {
            rvDzikirPagi.layoutManager = LinearLayoutManager(this@DzikirPagiActivity)
            rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}