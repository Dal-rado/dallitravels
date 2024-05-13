package com.example.dallitravels.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dallitravels.models.BusTicket
import com.example.dallitravels.ui.theme.screens.BusBookingScreen.HomeScreen
import com.example.dallitravels.ui.theme.screens.bookingConfirmation.BookingConfirmationScreen
import com.example.dallitravels.ui.theme.screens.login.LoginScreen
import com.example.dallitravels.ui.theme.screens.registration.RegisterScreen
import com.example.dallitravels.ui.theme.screens.splash.Splash

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN,
    ticket: BusTicket? = null, // Default to null if not provided
    onBookTicketClicked: (String, Int, String, String) -> Unit
) {

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination) {
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME) {
            HomeScreen(navController, onBookTicketClicked)
        }

        composable(ROUTE_SPLASH) {
            Splash(navController)
        }
        composable(ROUTE_CONFIRMATION) {
            ticket?.let { BookingConfirmationScreen(navController, it) }
        }
    }
}
