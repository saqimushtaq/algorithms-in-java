package com.saqib.algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        // take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int x = scanner.nextInt();
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
