package com.tsibteam.mobilefinancementor.presentation.mainlessonsmenu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.tsibteam.mobilefinancementor.R
import com.tsibteam.mobilefinancementor.databinding.ItemLessonCardBinding
import com.tsibteam.mobilefinancementor.domain.Lesson

class LessonGridAdapter : ListAdapter<Lesson, LessonViewHolder>(LessonDiffCallback()) {

    var onLessonClickListener: OnLessonClickListener? = null

    interface OnLessonClickListener {
        fun onLessonClick(position: Int, lesson: Lesson)
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
            ratingBar.rating = lesson.power.toFloat()
            chipComponent1.text = lesson.chip.chip1
            chipComponent2.text = lesson.chip.chip2
            chipComponent3.text = lesson.chip.chip3
        }
        binding.root.setOnClickListener {
            onLessonClickListener?.onLessonClick(position, lesson)
        }
    }

    private fun getCheckResource(checked: Boolean) =
        if (checked) R.drawable.ic_done else R.drawable.ic_not_done

}