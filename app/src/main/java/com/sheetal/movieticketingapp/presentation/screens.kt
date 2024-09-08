package com.sheetal.movieticketingapp.presentation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Screens(val route: String)
{
object HomeScreen : Screens(route = "home_screen")
object DetailScreen : Screens(route = "detail_screen")

}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun NavGraph(navController: NavHostController)
{
     NavHost(navController = navController, startDestination = Screens.HomeScreen.route)
    {
        composable(Screens.HomeScreen.route)
        {
            // Content for the start destination
            HomeScreen(navController = navController)
        }
        composable(Screens.DetailScreen.route) {

            DetailScreen(navController = navController)
        }

    }

}


