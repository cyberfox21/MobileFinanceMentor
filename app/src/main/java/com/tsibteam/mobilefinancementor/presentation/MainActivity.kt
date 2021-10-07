package com.tsibteam.mobilefinancementor.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.tsibteam.mobilefinancementor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val gridAdapter by lazy {
        LessonGridAdapter()
    }

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
        with(binding) {
            lessonRecycler.layoutManager = GridLayoutManager(this@MainActivity, 2)
            lessonRecycler.adapter = gridAdapter
        }
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
}