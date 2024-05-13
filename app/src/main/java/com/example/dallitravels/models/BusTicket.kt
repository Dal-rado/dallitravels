package com.example.dallitravels.models

data class BusTicket(val name: String, val age: Int, val destination: String, val dateOfTravel: String, var isBooked: Boolean = false)

class BookingConfirmation(val ticket: BusTicket) {
    fun displayConfirmation() {
        if (ticket.isBooked) {
            println("Booking Confirmation:")
            println("Name: ${ticket.name}")
            println("Age: ${ticket.age}")
            println("Destination: ${ticket.destination}")
            println("Date of Travel: ${ticket.dateOfTravel}")
            println("Booking Status: Confirmed")
        } else {
            println("Booking Confirmation:")
            println("Booking Status: Not Confirmed")
        }
    }
}

class HomeScreen {
    fun display() {
        val ticket = BusTicket("John Doe", 30, "New York", "2024-05-15")
        val confirmation = BookingConfirmation(ticket)

        // Simulate booking process
        ticket.isBooked = true

        // Display booking confirmation
        confirmation.displayConfirmation()
    }
}

fun main() {
    val screen = BusBookingScreen()
    screen.display()
}

