package com.tsibteam.mobilefinancementor.presentation.mainlessonsmenu

import androidx.recyclerview.widget.DiffUtil
import com.tsibteam.mobilefinancementor.domain.Lesson

class LessonDiffCallback : DiffUtil.ItemCallback<Lesson>() {

    override fun areItemsTheSame(oldItem: Lesson, newItem: Lesson): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Lesson, newItem: Lesson): Boolean {
        return oldItem == newItem
    }
}