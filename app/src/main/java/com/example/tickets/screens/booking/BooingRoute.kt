package com.example.tickets.screens.booking

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.tickets.Screen

fun NavGraphBuilder.bookingRoute(navController: NavController){
    composable(Screen.BookingScreen.route) { BookingScreen(navController) }
}
