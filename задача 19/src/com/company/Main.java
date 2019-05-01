package com.company;

public class Main {

    public static void main(String[] args) {
        int luckyTicket = 0;
        for (int i = 0; i < 1_000_000; i++) {
            if (i / 100_000 + (i / 10_000) % 10 + (i / 1000) % 10 == (i / 100) % 10 + (i / 10) % 10 + i % 10)
                luckyTicket++;
        }
        System.out.println(" The number of lucky tickets is: " +luckyTicket);
    }
}
