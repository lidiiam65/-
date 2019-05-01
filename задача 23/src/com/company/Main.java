package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        e = scan.nextInt();

        if (a<1 || a>13 || b<1 || b>13 || c<1 || c>13 || d<1 || d>13 || e<1 || e>13){
            System.out.println(" Введені числа не належать необхідному відрізку ( Менші за 1 або ж більші за 13 )");
        }
        int[]mas= {a,b,c,d,e};
        int count = 0;
        for(int i=0; i < mas.length; i ++){
            for(int j=0; j <mas.length; j++){
                if(mas[i]==mas[j] && i!=j){
                    count++;
                }
            }
        }
        System.out.println();
        if (count==20){
            System.out.println(" Impossible ");
        }
        else if (count==12){
            System.out.println(" Four of a kind ");
        }
        else if(count == 6){
            System.out.println("Three of a kind");
        }
        else if(count==2){
            System.out.println(" One pair");
        }
        else if(count==8){
            System.out.println(" Full house ");
        }
        else if(count==4 ){
            System.out.println(" Two pairs ");
        }
        else if(b==a+1 && c==a+2 && d==a+3 && e==a+4 ){
            System.out.println(" Straight ");
        }
        else {
            System.out.println(" Nothing ");
        }

    }
}
