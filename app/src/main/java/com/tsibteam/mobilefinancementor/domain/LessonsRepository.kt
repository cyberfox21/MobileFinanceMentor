package com.tsibteam.mobilefinancementor.domain

interface LessonsRepository {
    fun getLessonsList(): List<Lesson>
}