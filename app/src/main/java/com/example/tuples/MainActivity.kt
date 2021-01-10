package com.example.tuples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = math()
        var b = math1()
        Log.d("bbb","${a.first}")
        Log.d("bbb","${a.second}")
        Log.d("bbb","${b.first}")
        Log.d("bbb","${b.second}")
        Log.d("bbb","${b.third}")
    }
}
fun math() : Pair<Int,Float> = Pair(12,12.1F)
fun math1(): Triple<Int,Float,Int> = Triple(12,12.1F,12)
