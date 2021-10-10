package com.tsibteam.mobilefinancementor.domain.usecase

import com.tsibteam.mobilefinancementor.domain.repository.LessonsRepository
import com.tsibteam.mobilefinancementor.domain.entity.Lesson

class GetLessonListUseCase(private val repository: LessonsRepository) {
    operator fun invoke(): List<Lesson> {
        return repository.getLessonsList()
    }
}