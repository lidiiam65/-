package com.company;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 7, 3, 4, 11, 3, 8 };
        System.out.println(" Элементы массива : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
        System.out.println();

        int  min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if (min == arr[i]){
                min=arr[i]+1;
            }
        }
        System.out.println(" Минимальное число: " + min);
        System.out.println(" :) ");

    }
}
