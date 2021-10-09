package com.tsibteam.mobilefinancementor.presentation.mainlessonsmenu

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tsibteam.mobilefinancementor.databinding.ActivityMainBinding
import com.tsibteam.mobilefinancementor.domain.Lesson
import com.tsibteam.mobilefinancementor.presentation.lessonsfragment.LessonActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var gridAdapter: LessonGridAdapter

    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBinding()
        setContentView(binding.root)
        setupRecyclerView()
        observeViewModel()
        viewModel.getList()
    }

    private fun observeViewModel() {
        viewModel.lessonList.observe(this, {
            gridAdapter.submitList(it)
        })
    }

    private fun setBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
    }

    private fun setupRecyclerView() {
        gridAdapter = LessonGridAdapter()
        with(binding) {
            lessonRecycler.layoutManager = LinearLayoutManager(this@MainActivity)
            lessonRecycler.adapter = gridAdapter
        }
        gridAdapter.onLessonClickListener = object : LessonGridAdapter.OnLessonClickListener {
            override fun onLessonClick(position: Int, lesson: Lesson) {
                val intent = LessonActivity.newIntent(
                    this@MainActivity,
                    position,
                    lesson
                )
                Log.d("MainActivity", "gridAdapter.onLessonClickListener")
                startActivity(intent)
            }

        }
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

}