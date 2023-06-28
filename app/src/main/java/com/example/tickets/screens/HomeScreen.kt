package com.example.tickets.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tickets.R
import com.example.tickets.ui.theme.white87

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row() {
            
        }
        Image(
            painter = painterResource(id = R.drawable.home_image),
            contentDescription = "home image",
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .width(250.dp)
                .height(400.dp)
                .background(white87)

        )
        Text(
            color = white87,
            text = "test1"
        )

        Row(
            modifier = Modifier.background(Color.Blue),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                color = white87,
                text = "test3"
            )
            Text(
                color = white87,
                text = "test4"
            )
            Text(
                color = white87,
                text = "test5"
            )
        }


        Card(
            modifier = Modifier

                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)),
            colors = CardDefaults.cardColors(white87)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(8.dp))
            ) {

                Text(

                    text = "tes6"
                )
                Text(

                    text = "tes6"
                )
                Text(

                    text = "tes6"
                )
            }
            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = "tes6"
            )
            Text(

                text = "test7"
            )
            Text(

                text = "test8"
            )
        }

    }

}

@Preview
@Composable
fun preview() {
    HomeScreen()
}
