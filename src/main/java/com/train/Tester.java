package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Enter -1, if you have enough tickets.");
        Scanner scanner = new Scanner(System.in);
        int totalTickets = -2;
        while (totalTickets != -1){
            System.out.print("Please enter number of tickets: ");
            totalTickets = scanner.nextInt();
            if (totalTickets == -1){
                break;
            }
            System.out.print("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();

            Tickets tickets=new Tickets(totalTickets, roundTrip);
            tickets.print();
        }
        System.out.println("Thank you!");
    }
}
