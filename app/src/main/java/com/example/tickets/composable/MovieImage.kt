package com.example.tickets.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun MovieImage(id:Int,onClick:()->Unit){
    Box() {

    }
    Image(
        painter = painterResource(id = id),
        contentDescription = "home image",
        modifier = Modifier.clickable { onClick() }


    )
}
