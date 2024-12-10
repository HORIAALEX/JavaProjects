/*
Merge arrays. You are given two arrays of integers, both sorted in increasing order.
Return the merged array, its elements should also be in increasing order.
 */


import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Lab2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[m];

            for(int g = 0; g < n; g++)
                arr[g] = sc.nextInt();
            for(int g = 0; g < m; g++)
                arr2[g] = sc.nextInt();
            int[] result = mergeArrays(arr, arr2);

            for (int value : result) {
                System.out.print(value + " ");
            }

        } catch (InputMismatchException e)
        {
            System.out.println("Input a valid number");
        }
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < n) {
            result[k++] = arr1[i++];
        }
        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}

