package com.tsibteam.mobilefinancementor.data

import com.tsibteam.mobilefinancementor.R
import com.tsibteam.mobilefinancementor.domain.Lesson
import com.tsibteam.mobilefinancementor.domain.LessonsRepository


object LessonsRepositoryImpl : LessonsRepository {

    private const val LESSONS_COUNT = 11

    private var lessons = ArrayList<Lesson>()

    init {

        for (i in 0 until LESSONS_COUNT) {
            //lessons.add(Lesson(i+1, images[i], titles[i], checks[i]))
            lessons.add(
                Lesson(
                    +1,
                    R.drawable.ic_android_black_24dp,
                    "Трейдинг",
                    true
                )
            )
        }
    }

    override fun getLessonsList(): List<Lesson> {
        return lessons
    }

}