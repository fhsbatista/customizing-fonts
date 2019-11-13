package com.example.customizingfonts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customizingfonts.util.FontHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //This way we can set a custom font programmatically. It may be useful if we want to set a custom font in a special place.
//        FontHelper.setPoppins(headerTv)
    }
}
