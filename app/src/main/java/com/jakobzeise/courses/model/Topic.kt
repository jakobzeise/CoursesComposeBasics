package com.jakobzeise.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val numberOfVideos: Int,
    @DrawableRes val image: Int
)
