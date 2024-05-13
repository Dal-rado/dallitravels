package com.example.dallitravels.models

class BusBookingController {
    fun bookTicket(name: String, age: Int, destination: String, dateOfTravel: String) {
        // Assuming we have a BusBookingModel to handle the data storage and booking logic
        val model = BusBookingModel()

        if (model.checkAvailability(destination, dateOfTravel)) {
            val ticket = model.book(name, age, destination, dateOfTravel)
            println("Ticket booked successfully!\n$ticket")
        } else {
            println("Sorry, no seats available for $destination on $dateOfTravel.")
        }
    }
}