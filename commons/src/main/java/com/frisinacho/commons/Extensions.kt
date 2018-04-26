package com.frisinacho.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(layoutRedId: Int, attachToRoot: Boolean = false): View{
    val inflater = LayoutInflater.from(context)
    return inflater.inflate(layoutRedId, this, attachToRoot)
}