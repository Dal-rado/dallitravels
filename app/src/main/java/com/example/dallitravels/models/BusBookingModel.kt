package com.example.dallitravels.models

class BusBookingModel {
    private val bookings = mutableListOf<BusTicket>()

    fun checkAvailability(destination: String, dateOfTravel: String): Boolean {
        // Logic to check availability based on destination and date
        // For simplicity, let's assume there's a limit of 50 seats and no date restrictions
        return bookings.size < 14
    }

    fun book(name: String, age: Int, destination: String, dateOfTravel: String): BusTicket {
        val ticket = BusTicket(name, age, destination, dateOfTravel)
        bookings.add(ticket)
        return ticket
    }
}
