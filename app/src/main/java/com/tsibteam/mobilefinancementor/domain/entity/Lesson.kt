package com.tsibteam.mobilefinancementor.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Lesson(
    val id: Int,
    val image: Int,
    val title: String,
    val check: Boolean,
    val chip: Chip,
    val power: Int
) : Parcelable