package ru.bruh.barcodesaver.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.bruh.barcodesaver.AppNavigator
import ru.bruh.barcodesaver.R

class MainActivity : AppCompatActivity() {

    private lateinit var navigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigator = AppNavigator(this)

        navigator.navigateToMainScreen()
    }
}