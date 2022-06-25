package com.train;

public class Tickets {
    int totalTickets;
    int roundTrip;
    int total;

    public Tickets(int totalTickets, int roundTrip) {
        this.totalTickets = totalTickets;
        this.roundTrip = roundTrip;
    }

    public void print() {
        System.out.println("Total tickets: " + totalTickets+"\n"
                + "Round-trip: " + roundTrip+"\n"
                + "Total: " +(int)((totalTickets - roundTrip) * 1000 + roundTrip * 2000 * 0.9));
    }
}
