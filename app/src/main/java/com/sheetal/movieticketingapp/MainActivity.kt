package com.sheetal.movieticketingapp

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.sheetal.movieticketingapp.presentation.AppTheme
import com.sheetal.movieticketingapp.presentation.NavGraph
import com.sheetal.movieticketingapp.ui.theme.MovieTicketingAppTheme


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContent {
            MovieTicketingAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = AppTheme.primaryColor
                ) {
                    window.statusBarColor = AppTheme.primaryColor.toArgb()
                    window.decorView.systemUiVisibility = 0
                    window.decorView.systemUiVisibility =
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE

                    val navController = rememberNavController()
                    NavGraph(navController = navController)   // NavGraph will handle initial navigation


                }
            }
        }
    }
}

