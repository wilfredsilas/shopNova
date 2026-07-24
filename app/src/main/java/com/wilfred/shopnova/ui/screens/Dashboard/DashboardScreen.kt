package com.wilfred.shopnova.ui.screens.Dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ContactPhone
import androidx.compose.material.icons.filled.Contacts
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wilfred.shopnova.ui.screens.auth.LoginScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){


    Column(
        modifier = Modifier.fillMaxSize()
    ) {



        TopAppBar(


            title = { Text(
                text = "Admin Dashboard") },
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "arrow back"
                    )
                }

            },


            actions = {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "shoppingcart"
                    )
                }


                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.ContactPhone,
                        contentDescription = "notification"
                    )
                }


            },

            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Red,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            )




        )



    }


}


@Preview(showBackground= true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())



}