package com.tsibteam.mobilefinancementor.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsibteam.mobilefinancementor.databinding.ActivityLessonBinding
import com.tsibteam.mobilefinancementor.databinding.ProfileActivityBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ProfileActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBinding()
        setContentView(binding.root)
        addListeners()
    }

    private fun setBinding() {
        binding = ProfileActivityBinding.inflate(layoutInflater)
    }

    private fun addListeners() {
//        binding.materialToolBar.setOnClickListener {
//            finish()
//        }
    }

    companion object {
        fun newIntent(context: Context) : Intent {
            return Intent(context, ProfileActivity::class.java)
        }
    }

}