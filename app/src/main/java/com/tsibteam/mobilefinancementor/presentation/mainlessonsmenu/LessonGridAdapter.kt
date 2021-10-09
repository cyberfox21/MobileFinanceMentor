package com.tsibteam.mobilefinancementor.presentation.mainlessonsmenu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.tsibteam.mobilefinancementor.R
import com.tsibteam.mobilefinancementor.databinding.ItemLessonCardBinding
import com.tsibteam.mobilefinancementor.domain.Lesson

class LessonGridAdapter : ListAdapter<Lesson, LessonViewHolder>(LessonDiffCallback()) {

    var onLessonClickListener : OnLessonClickListener? = null

    interface OnLessonClickListener{
        fun onLessonClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(ItemLessonCardBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val binding = holder.binding
        val lesson = currentList[position]
        with(binding) {
            ivLessonImage.setImageResource(lesson.image)
            tvTitle.text = lesson.title
            tvLessonNumber.text = lesson.id.toString()
            ivLessonCheck.setImageResource(getCheckResource(lesson.check))
        }
        binding.root.setOnClickListener {
            onLessonClickListener?.onLessonClick(position)
        }
    }

    private fun getCheckResource(checked: Boolean) =
        if (checked) R.drawable.ic_done else R.drawable.ic_not_done

}