package com.tsibteam.mobilefinancementor.domain.repository

import com.tsibteam.mobilefinancementor.domain.entity.Lesson

interface LessonsRepository {
    fun getLessonsList(): List<Lesson>
}