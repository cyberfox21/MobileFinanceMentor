package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsibteam.mobilefinancementor.databinding.ActivityLessonBinding

class LessonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLessonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setBinding()
        setContentView(binding.root)
    }

    private fun setBinding() {
        binding = ActivityLessonBinding.inflate(layoutInflater)
    }

    companion object{

        const val POSITION_EXTRA = "position_extra"

        fun newIntent(context: Context, position: Int) : Intent{
            return Intent(context, LessonActivity::class.java).apply {
                putExtra(POSITION_EXTRA, position)
            }
        }
    }
}