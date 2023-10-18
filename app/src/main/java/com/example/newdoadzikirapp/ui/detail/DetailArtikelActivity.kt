package com.example.newdoadzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.newdoadzikirapp.adapter.ArtikelAdapter
import com.example.newdoadzikirapp.model.ArtikelModel
import com.example.newdoadzikirapp.databinding.ActivityDetailArtikelBinding

class DetailArtikelActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailArtikelBinding

    companion object {
        const val DETAIL_DESC = "detail_desc"
        const val DETAIL_TITLE = "detail_title"
        const val DETAIL_IMAGE = "detail_image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailArtikelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra(DETAIL_TITLE)
        val desc = intent.getStringExtra(DETAIL_DESC)
        val image = intent.getIntExtra(DETAIL_IMAGE, 0)

        binding.apply {
            tvDetailTitle.text = title
            tvDetailDesc.text = desc

            Glide.with(this@DetailArtikelActivity)
                .load(image)
                .into(imgDetail)
        }

    }
}