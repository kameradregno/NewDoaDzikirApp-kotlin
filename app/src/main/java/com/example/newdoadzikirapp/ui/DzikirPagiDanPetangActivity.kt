package com.example.newdoadzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.newdoadzikirapp.R
import com.example.newdoadzikirapp.adapter.ArtikelAdapter
import com.example.newdoadzikirapp.ui.detail.DzikirPagiActivity
import com.example.newdoadzikirapp.ui.detail.DzikirPetangActivity
import com.example.newdoadzikirapp.databinding.ActivityDzikirPagiDanPetangBinding

class DzikirPagiDanPetangActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDzikirPagiDanPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiDanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi & Petang"


        setView()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

    private fun setView() {
        binding.apply {
            cvDzikirPagi.setOnClickListener(this@DzikirPagiDanPetangActivity)
            cvDzikirPetang.setOnClickListener(this@DzikirPagiDanPetangActivity)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.cv_dzikir_pagi -> {
                val intentPagi = Intent(this@DzikirPagiDanPetangActivity, DzikirPagiActivity::class.java)
                startActivity(intentPagi)
            }

            R.id.cv_dzikir_petang -> {
                val intentPetang = Intent(this@DzikirPagiDanPetangActivity, DzikirPetangActivity::class.java)
                startActivity(intentPetang)
            }

        }
    }

}