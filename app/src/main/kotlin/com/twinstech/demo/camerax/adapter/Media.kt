package com.twinstech.demo.camerax.adapter

import android.net.Uri

data class Media(
    val uri: Uri,
    val isVideo: Boolean,
    val date: Long,
)
