import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            int n;
            n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = getMaxValue(arr);
            int min = getMinValue(arr);
            System.out.println(max);
            System.out.println(min);
        }
        catch (InputMismatchException e) {
            System.out.println("INVALID INPUT >> PLEASE INPUT A VALID NUMBER");
        }

    }
    private static int getMaxValue(int[] arr)
    {
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    private static int getMinValue(int[] arr)
    {
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}

