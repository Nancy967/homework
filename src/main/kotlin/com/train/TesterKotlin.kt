package com.train

import java.util.Scanner

fun main() {
    print("Please enter number of tickets: ")
    val scanner = Scanner(System.`in`)
    var totalTickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundTrip = scanner.nextInt()

    val tickets = TesterKotlin(totalTickets, roundTrip)
    tickets.print()
}

class TesterKotlin(var totalTickets:Int, var roundTrip:Int){
    fun print(){
        print("Total tickets: " + totalTickets+"\n"
                + "Round-trip: " + roundTrip+"\n"
                + "Total: " +((totalTickets - roundTrip) * 1000 + roundTrip * 2000 * 0.9))
    }
}