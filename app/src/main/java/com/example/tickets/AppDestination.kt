package com.example.tickets

sealed class Screen(
    val route: String,
) {

    object BookingScreen : Screen(route = "BookingScreen")

    object HomeScreen : Screen(route = "HomeScreen")

    object DetailsScreen : Screen(route = "DetailsScreen")

}
