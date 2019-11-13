package com.example.customizingfonts.util

import android.graphics.Typeface
import android.widget.TextView

//This helper allows the programmer to set a custom font programmatically.
object FontHelper {
    fun setPoppins(tv: TextView) {
        val face = Typeface.createFromAsset(tv.context.assets, "poppins.ttf")
        tv.typeface = face
    }
}