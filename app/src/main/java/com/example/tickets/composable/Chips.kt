package com.example.tickets.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ChipsGroup(chipList: List<String>) {

    var selected by rememberSaveable{ mutableStateOf(chipList.get(0)) }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center


    ) {
        chipList.forEach { it ->
            Chip(title = it,
                selected = selected,
                onSelected = {
                    selected = it
                })

        }
    }
}

@Composable
fun Chip(
    title: String,
    selected: String,
    onSelected: (String) -> Unit
) {
    val isSelected = selected == title
    val backGround = if (isSelected) Color.Blue else Color.LightGray
    val contentColor = if (isSelected) Color.White else Color.Black

    Box(
        modifier = Modifier
            .padding(end = 10.dp)
            .clip(CircleShape)
            .background(backGround)
            .clickable(
                onClick = {
                    onSelected(title)
                }
            )
    ) {


        Text(
            text = title, color = contentColor,
            modifier = Modifier
                .padding( start = 10.dp,end= 10.dp, top = 5.dp, bottom = 5.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun preview() {
    val chipsList = mutableListOf("Now Showing", "Coming Soon")
    ChipsGroup(chipsList)

}