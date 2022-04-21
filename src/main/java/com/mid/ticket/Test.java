package com.mid.ticket;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start?");
        int choice = Integer.parseInt(scanner.next());
        Station start = null;
        switch (choice){
            case 1 :
                start = Station.TAIPEI;
                break;
            case 2 :
                start = Station.TAICHUNG;
                break;
            case 3 :
                start = Station.KAOHSIUNG;
                break;
        }
        System.out.println("End?");
        choice = Integer.parseInt(scanner.next());
        Station end = null;
        switch (choice){
            case 1 :
                end = Station.TAIPEI;
                break;
            case 2 :
                end = Station.TAICHUNG;
                break;
            case 3 :
                end = Station.KAOHSIUNG;
                break;
        }
        System.out.println("Which?");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choice){
            case 1 :
                ticket = new Ticket(start,end);
                break;
            case 2 :
                ticket = new Student(start,end);
                break;
        }
        ticket.print();
    }
}
