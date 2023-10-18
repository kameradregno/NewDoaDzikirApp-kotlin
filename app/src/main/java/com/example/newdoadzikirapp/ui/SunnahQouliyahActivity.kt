package com.example.newdoadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newdoadzikirapp.adapter.DzikirDoaAdapter
import com.example.newdoadzikirapp.model.DataDzikirDoa
import com.example.newdoadzikirapp.model.DzikirDoaModel
import com.example.newdoadzikirapp.databinding.ActivitySunnahQouliyahBinding

class SunnahQouliyahActivity : AppCompatActivity() {

    lateinit var binding: ActivitySunnahQouliyahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahQouliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah - Sunnah Qouliyah"

        binding.apply {
            rvQauliyahShalat.layoutManager = LinearLayoutManager(this@SunnahQouliyahActivity)
            rvQauliyahShalat.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

}