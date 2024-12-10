import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first_name = sc.nextLine();
        System.out.print("Enter your last name: ");
        String last_name = sc.nextLine();
        System.out.print("Enter your Social Security Number: ");
        int length = last_name.length();


        System.out.print(first_name.substring(0,2).toLowerCase()+last_name.substring(length-2, length).toUpperCase());
    }
}
