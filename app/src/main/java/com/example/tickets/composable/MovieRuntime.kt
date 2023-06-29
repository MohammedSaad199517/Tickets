package com.example.tickets.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tickets.R

@Composable
fun MovieRunTime(time:String){
    Row(

        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            tint= Color.LightGray,
            painter = painterResource(R.drawable.baseline_access_time_24),
            contentDescription = stringResource(id = R.string.time)
        )
        Text(text = "$time" ,color= Color.Black)
    }
}

@Preview(showSystemUi = true)
@Composable
fun preview2() {
    MovieRunTime(time = "2h 23m")

}