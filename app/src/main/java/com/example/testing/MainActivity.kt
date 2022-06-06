package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Line comment
/*
Block comment
 */
/**
 * Method documentation comment blcok
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}