package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Question_14();
    }

    public static void Question_14() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the length of array: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];

        System.out.println(" Enter elements of the current array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayList<Integer> minIdxes = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < minIdxes.size(); j++) {
                if (arr[i] > arr[minIdxes.get(j)]) {
                    arr[minIdxes.get(j)] = arr[i];
                    minIdxes.remove(j);
                    j--;
                }
            }
            minIdxes.add(i);
            if (i == arr.length - 1) {
                for (int j = 0; j < minIdxes.size(); j++) {
                    arr[minIdxes.get(j)] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
