package com.example.dallitravels

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.dallitravels.navigation.AppNavHost
import com.example.dallitravels.ui.theme.DallitravelsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DallitravelsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost(
                        onBookTicketClicked = { destination, quantity, date, time ->
                            // Handle the booking action here
                            // For example, you can navigate to a booking screen passing the necessary data
                        }
                    )
                }
            }
        }
    }
}