package com.example.dallitravels.ui.theme.screens.BusBookingScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dallitravels.R
import com.example.dallitravels.navigation.ROUTE_CONFIRMATION

@Composable
fun HomeScreen(navController: NavHostController, onBookTicketClicked: (String, Int, String, String) -> Unit) {
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf(0) }
    var destination by remember { mutableStateOf("") }
    var dateOfTravel by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("BOOKINGS",
            color = Color.White,
            fontSize = 41.sp,
            style = MaterialTheme
            .typography.bodyLarge)
        Text("Please enter details to book!",
            color = Color.White)

        Spacer(modifier = Modifier.height(21.dp))
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = age.toString(),
            onValueChange = { age = it.toIntOrNull() ?: 0 },
            label = { Text("Age") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = destination,
            onValueChange = { destination = it },
            label = { Text("Destination") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = dateOfTravel,
            onValueChange = { dateOfTravel = it },
            label = { Text("Date of Travel (DD/MM/YYYY)") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                onBookTicketClicked(name, age, destination, dateOfTravel)
                // Navigate to another screen after booking ticket
                navController.navigate(ROUTE_CONFIRMATION)
            },
            enabled = name.isNotBlank() && age > 0 && destination.isNotBlank() && dateOfTravel.isNotBlank()
        ) {
            Text("Book Ticket")
        }
        Image(painterResource(id = R.drawable.dalli2) , contentDescription = "makeup",)
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen(navController = rememberNavController(), onBookTicketClicked = { _, _, _, _ -> })
}