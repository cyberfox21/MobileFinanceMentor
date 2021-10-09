package com.tsibteam.mobilefinancementor.data

import com.tsibteam.mobilefinancementor.Constants
import com.tsibteam.mobilefinancementor.R
import com.tsibteam.mobilefinancementor.domain.Chip
import com.tsibteam.mobilefinancementor.domain.Lesson
import com.tsibteam.mobilefinancementor.domain.LessonsRepository


object LessonsRepositoryImpl : LessonsRepository {

    private val titles = arrayListOf(
        "Инвестиции",
        "Брокерский счёт",
        "Акции",
        "Облигации",
        "Фондовые вложения",
        "Валюта",
        "Золото, медь и другие товары"
    )

    private val chips = arrayListOf(
        Chip("Инвестиции", "Депозит", "Инфляция"),
        Chip("Брокера", "Биржа", "НДФЛ"),
        Chip("Акции", "Дивиденты", "Диверсификация"),
        Chip("Облигации", "Компании", "Номинал"),
        Chip("Фонды", "ПИФ", "ETF"),
        Chip("Валюты", "Трейдинг", "Еврооблигации"),
        Chip("Товары", "Консервативный актив", "Продажа"),
    )

    private val images = arrayListOf(
        R.drawable.image_lesson_1,
        R.drawable.image_lesson_2,
        R.drawable.image_lesson_3,
        R.drawable.image_lesson_4,
        R.drawable.image_lesson_5,
        R.drawable.image_lesson_6,
        R.drawable.image_lesson_7
    )

    private var lessons = ArrayList<Lesson>()

    init {
        for (i in 0 until Constants.LESSONS_COUNT) {
            lessons.add(Lesson(i+1, images[i], titles[i], false, chips[i], i+3))
        }
    }

    override fun getLessonsList(): List<Lesson> {
        return lessons
    }

}