package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.tsibteam.mobilefinancementor.Constants.LESSONS_COUNT
import com.tsibteam.mobilefinancementor.R
import com.tsibteam.mobilefinancementor.databinding.ActivityLessonBinding
import com.tsibteam.mobilefinancementor.domain.entity.Lesson
import com.tsibteam.mobilefinancementor.presentation.TestFragment

class LessonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLessonBinding

    private var layout: Int = R.layout.lesson_1_invest
    private var fragment: Fragment = Lesson1Fragment()
    private var name : String = ""
    private lateinit var lesson : Lesson

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        parseIntent()
        setBinding()
        setContentView(binding.root)
        addListeners()
        //setLayout()
    }

    private fun addListeners() {
        binding.navigationRail.setOnItemSelectedListener {  item ->
            when(item.itemId) {
                R.id.nav_teory -> {
                    name = lesson.title
                    setLayout()
                    true
                }
                R.id.nav_test -> {
                    name = "Тест " + lesson.title
                    setTest()
                    true
                }
                else -> false
            }
        }
//        binding.navigationRail.menu.findItem(0).setOnMenuItemClickListener {
//            name = lesson.title
//            setLayout()
//            true
//        }
//
//        binding.navigationRail.menu.findItem(1).setOnMenuItemClickListener {
//            name = "Тест " + lesson.title
//            setTest()
//            true
//        }
//        .OnNavigationItemSelectedListener { item ->
//            when(item.itemId) {
//                R.id.nav_teory -> {
//                    name = lesson.title
//                    setLayout()
//                    true
//                }
//                R.id.nav_test -> {
//                    name = "Тест " + lesson.title
//                    setTest()
//                    true
//                }
//                else -> false
//            }
//        }

    }

    private fun setTest(){
        binding.toolbar.title = name
        val testFragment = TestFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, testFragment)
            .commit()
    }

    private fun setLayout() {
        binding.toolbar.title = name
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .commit()
    }

    private fun parseIntent() {
        if (!intent.hasExtra(POSITION_EXTRA)) {
            throw RuntimeException("Param POSITION_EXTRA is absent")
        }
        if (!intent.hasExtra(LESSON_EXTRA)) {
            throw RuntimeException("Param LESSON_EXTRA is absent")
        }
        val position = intent.getIntExtra(POSITION_EXTRA, 0)
        if (position >= LESSONS_COUNT) {
            throw RuntimeException("Unknown POSITION_EXTRA $position")
        }
        lesson = intent.getParcelableExtra<Lesson>(LESSON_EXTRA)!!
//        val name = when (position) {
//            0 -> lesson?.title
//            1 -> R.layout.lesson_2_brocker
//            2 -> R.layout.lesson_3_acii
//            3 -> R.layout.lesson_4_obligations
//            4 -> R.layout.lesson_5_fonds
//            5 -> R.layout.lesson_6_currency
//            6 -> R.layout.lesson_7_metals
//            else -> throw RuntimeException("Unknown POSITION_EXTRA $position")
//        }
        fragment = when (position) {
            0 -> Lesson1Fragment()
            1 -> Lesson2Fragment()
            2 -> Lesson3Fragment()
            3 -> Lesson4Fragment()
            4 -> Lesson5Fragment()
            5 -> Lesson6Fragment()
            6 -> Lesson7Fragment()
            else -> throw RuntimeException("Unknown POSITION_EXTRA $position")
        }
    }

    private fun setBinding() {
        binding = ActivityLessonBinding.inflate(layoutInflater)
    }

    companion object {

        private const val POSITION_EXTRA = "position_extra"
        private const val LESSON_EXTRA = "lesson_extra"

        fun newIntent(context: Context, position: Int, lesson: Lesson): Intent {
            return Intent(context, LessonActivity::class.java).apply {
                putExtra(POSITION_EXTRA, position)
                putExtra(LESSON_EXTRA, lesson)
            }
        }
    }
}