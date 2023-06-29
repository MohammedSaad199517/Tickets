package com.example.tickets.screens.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.tickets.Screen

fun NavGraphBuilder.homeRoute(navController: NavController){
    composable(Screen.HomeScreen.route) { HomeScreen(navController) }
}

