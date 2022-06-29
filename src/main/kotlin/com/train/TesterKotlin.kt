package com.train

import java.util.Scanner

fun main() {
    println("Enter -1, if you have enough tickets.")
    var totalTickets = -2
    while (totalTickets != -1){
        print("Please enter number of tickets: ")
        totalTickets = readLine()!!.toInt()
        if (totalTickets == -1){
            break
        }
        print("How many round-trip tickets: ")
        var roundTrip = readLine()!!.toInt()

        val tickets = TesterKotlin(totalTickets, roundTrip)
        tickets.print()
    }
    println("Thank you!")
}

class TesterKotlin(var totalTickets:Int, var roundTrip:Int){
    fun print(){
        println("Total tickets:$totalTickets\nRound-trip:$roundTrip\nTotal:${total()}" )
    }
    fun total() = (totalTickets - roundTrip) * 1000 + roundTrip * 2000 * 0.9
}