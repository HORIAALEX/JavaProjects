import java.awt.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the lower number: ");
        int lower = scanner.nextInt();
        System.out.print("Input the upper number: ");
        int upper = scanner.nextInt();
        double random = rand.nextInt(upper);
        int tries = 0;

        while(tries < 1) {

            System.out.print("Put a new number: ");
            int input = scanner.nextInt();
            if (input <= upper && input >= lower) {

                if (input > random) {
                    System.out.println("Your number is too high.");
                    tries = tries + 1;

                } else if (input < random) {
                    System.out.println("Your number is too low.");
                    tries = tries + 1;
                }
                else if (input == random) {
                    break;
                }
            }
            else
                {
                    System.out.println("Input a ranged number from the interval.");
                }
            }

        if(tries==0) {
            System.out.println("You got it! You guessed the number.");
        } else if (tries==10) {
            System.out.println("You lose! GAME OVER");
        }

    }
}