package com.example.dallitravels.ui.theme.screens.bookingConfirmation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dallitravels.R
import com.example.dallitravels.models.BusTicket
import com.example.dallitravels.navigation.ROUTE_HOME

@Composable
fun BookingConfirmationScreen(navController: NavController, ticket: BusTicket) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Booking Confirmation", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Ticket booked successfully!", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Passenger Name: ${ticket.name}")
        Text("Age: ${ticket.age}")
        Text("Destination: ${ticket.destination}")
        Text("Date of Travel: ${ticket.dateOfTravel}")

        Button(
            onClick = {
                navController.navigate(ROUTE_HOME)
            },
            modifier = Modifier.padding(vertical = 16.dp)
        ) {
            Text("Back to Home")
        }
        Image(painterResource(id = R.drawable.dalli1) , contentDescription = "makeup",)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookingConfirmationScreen() {
    // For preview, you can pass a dummy NavController
    val navController = rememberNavController()
    BookingConfirmationScreen(
        navController = navController,
        ticket = BusTicket(
            name = "Dalmas Oreje",
            age = 18,
            destination = "Nairobi",
            dateOfTravel = "18/08/2024"
        )
    )
}
