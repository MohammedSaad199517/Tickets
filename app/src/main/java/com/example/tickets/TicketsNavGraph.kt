package com.example.tickets

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tickets.screens.details.DetailsScreen
import com.example.tickets.screens.home.homeRoute

@Composable
fun TicketsNavGraph (navController: NavHostController){

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        homeRoute(navController)
        composable(Screen.DetailsScreen.route) { DetailsScreen(navController) }
    }
}