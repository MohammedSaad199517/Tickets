package com.example.tickets.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tickets.R
import com.example.tickets.Screen
import com.example.tickets.composable.ChipsGroup
import com.example.tickets.composable.MovieImage
import com.example.tickets.composable.MovieRunTime
import com.example.tickets.ui.theme.white87


@Composable
fun HomeScreen(
    navController: NavController
) {
    val chipsList = mutableListOf("Now Showing", "Coming Soon")
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(42.dp))
        ChipsGroup(chipsList)
        Spacer(modifier = Modifier.height(42.dp))

        MovieImage(
            id=R.drawable.home,
            onClick = {
                navController.navigate(Screen.DetailsScreen.route)
            }
        )
        Spacer(modifier = Modifier.height(42.dp))
        MovieRunTime(time = "2h 23m")
        Text(
            text = "Fantastic beast:the secrets of dumbledore",
            fontSize = 24.sp,
            modifier = Modifier.padding(50.dp,0.dp,)
        )
        Card(
            modifier = Modifier

                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)),
            colors = CardDefaults.cardColors(white87)
        ) {

        }

    }

}

@Preview
@Composable
fun preview() {
    val navController = rememberNavController()

    HomeScreen(navController)
}
