package com.tsibteam.mobilefinancementor.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Chip(val chip1: String, val chip2: String, val chip3: String) : Parcelable