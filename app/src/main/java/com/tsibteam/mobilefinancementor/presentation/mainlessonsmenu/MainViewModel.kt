package com.tsibteam.mobilefinancementor.presentation.mainlessonsmenu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tsibteam.mobilefinancementor.data.LessonsRepositoryImpl
import com.tsibteam.mobilefinancementor.domain.GetLessonListUseCase
import com.tsibteam.mobilefinancementor.domain.Lesson

class MainViewModel : ViewModel() {

    private var _lessonsListLD = MutableLiveData<List<Lesson>>()
    val lessonList: LiveData<List<Lesson>>
        get() = _lessonsListLD

    private val repository = LessonsRepositoryImpl

    private val getLessonListUseCase = GetLessonListUseCase(repository)

    fun getList() {
        _lessonsListLD.value = getLessonListUseCase.invoke()
    }

}