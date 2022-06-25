package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int totalTickets = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
        int roundTrip = scanner.nextInt();

        Tickets tickets=new Tickets(totalTickets, roundTrip);
        tickets.print();
    }
}
