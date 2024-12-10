import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            int sum=0;
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++)
            {
                if(arr[i] % 2 == 0)
                    sum += arr[i];
            }
            System.out.println(sum);

        }   catch (InputMismatchException e)
        {
            System.out.println("Please enter a valid number");
        }

    }
}
