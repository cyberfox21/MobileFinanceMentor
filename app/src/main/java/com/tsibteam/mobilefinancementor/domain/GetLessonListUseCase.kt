package com.tsibteam.mobilefinancementor.domain

class GetLessonListUseCase(private val repository: LessonsRepository) {
    operator fun invoke(): List<Lesson> {
        return repository.getLessonsList()
    }
}