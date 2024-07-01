package com.saqib.algorithms;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        selectSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
