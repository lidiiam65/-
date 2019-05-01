package com.company;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your birth date: ");
        int b_day = scanner.nextInt();
        int b_month = scanner.nextInt();
        int b_year = scanner.nextInt();

        System.out.println(" Enter the current day: ");
        int с_day = scanner.nextInt();
        int с_month = scanner.nextInt();
        int с_year = scanner.nextInt();

        if ((b_year >= 1920 && b_year <= 3000) && (с_year >= 1920 && с_year <= 3000)) {

            Calendar calendar1 = Calendar.getInstance();
            calendar1.set(b_year, b_month, b_day);

            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(с_year, с_month, с_day);

            long diff = calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
            long days = TimeUnit.MILLISECONDS.toDays(diff);
            System.out.println(" Days left to your birthday ");
            System.out.println(Math.abs((int)days));
        }

        else {
            System.out.println(" ERROR ");
            System.out.println(" Date is wrong! ");
        }
    }
}
