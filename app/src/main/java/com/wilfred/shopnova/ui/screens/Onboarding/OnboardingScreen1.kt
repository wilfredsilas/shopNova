package com.wilfred.shopnova.ui.screens.Onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wilfred.shopnova.R
import com.wilfred.shopnova.navigation.ROUT_ONBOARDING2

@Composable
fun OnboardingScreen1(navController: NavController){


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

    Image(
        painter = painterResource(R.drawable.cat),
        contentDescription = "cat",
        modifier = Modifier.size(200.dp)
    )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "ShopNova",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Shop smart, live better.",
            fontSize = 20.sp,
        )

        Spacer(modifier = Modifier.height(5.dp))


        Text(
            text = "ShopNova Kenya the #1 Online Store in Kenya ✓ Buy Phones, Laptops, Appliances, Clothes, TVs & Home Essentials from Top Brands ✓ Best Prices in Kenya ...",
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = { navController.navigate(ROUT_ONBOARDING2)},
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(250.dp)
        ) {
            Text(
                text = "Get Started"
            )

        }


    }


}


@Preview(showBackground= true)
@Composable
fun OnboardingScreen1Preview(){
    OnboardingScreen1(rememberNavController())



}