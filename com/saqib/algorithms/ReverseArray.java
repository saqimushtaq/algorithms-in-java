package com.saqib.algorithms;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}
