package com.example.dallitravels.models

import java.util.*

class BusBookingScreen {
    fun display() {
        println("Welcome to Bus Booking System!")
        println("Please enter your details to book a bus ticket.")

        val scanner = Scanner(System.`in`)

        println("Enter your name:")
        val name = scanner.nextLine()

        println("Enter your age:")
        val age = scanner.nextInt()

        println("Enter the destination:")
        val destination = scanner.next()

        println("Enter the date of travel (DD/MM/YYYY):")
        val dateOfTravel = scanner.next()

        // Assuming we have a BusBookingController to handle the booking logic
        val controller = BusBookingController()
        controller.bookTicket(name, age, destination, dateOfTravel)
    }
}

