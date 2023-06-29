package com.example.tickets

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions




@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TicketsApp() {

    val navController = rememberNavController()

    val tabItems = listOf("Home", "search", "profile")
    val selectedItem = remember { mutableStateOf(0) }

    // get navBackStackEntry as State so we can refresh the ui onBackStack event.
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val parentRouteName = navBackStackEntry.value?.destination?.parent?.route
    //Get current page name from backStackEntry
    val routeName = navBackStackEntry.value?.destination?.route
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "$routeName") })
        },
        bottomBar =
        {

            NavigationBar() {
                tabItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = parentRouteName == item,
                        onClick = {
                            selectedItem.value = index

                            navController.navigate(item, navOptions {

                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }

                                launchSingleTop = true
                                restoreState = true

                            })


                        },
                        icon = {
                            //in this lambda function set icon for bar item
                            // by check item name and set icon according to that.
                            when (item) {
                                "Home" -> Icon(
                                    painter = painterResource(id = R.drawable.baseline_access_time_24),
                                    contentDescription = null
                                )

                                "Product" -> Icon(
                                    painter = painterResource(id = R.drawable.baseline_access_time_24),
                                    contentDescription = null
                                )

                                "Setting" -> Icon(
                                    painter = painterResource(id = R.drawable.baseline_access_time_24),
                                    contentDescription = null
                                )
                            }

                        },
                        label = { Text(text = item) })
                }

            }

        },

        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it), contentAlignment = Alignment.Center
            ) {
                TicketsNavGraph(navController = navController)


            }

        }
    )

}
