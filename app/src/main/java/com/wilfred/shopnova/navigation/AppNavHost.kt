package com.wilfred.shopnova.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wilfred.shopnova.ui.screens.Home.HomeScreen
import com.wilfred.shopnova.ui.screens.Onboarding.OnboardingScreen1
import com.wilfred.shopnova.ui.screens.Onboarding.OnboardingScreen2
import com.wilfred.shopnova.ui.screens.Onboarding.OnboardingScreen3
import com.wilfred.shopnova.ui.screens.Onboarding.OnboardingScreen3Preview
import com.wilfred.shopnova.ui.screens.auth.RegisterScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }

        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUT_ONBOARDING1) {
            OnboardingScreen1(navController)
        }

        composable(ROUT_ONBOARDING2) {
            OnboardingScreen2(navController)
        }

        composable(ROUT_ONBOARDING3) {
            OnboardingScreen3(navController)
        }




    }

}