import java.util.Scanner;
import java.util.Random;

public class Lab1_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[5][6];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++)
            {
                array[i][j] = rand.nextInt(101);
            }}
        for(int i = 0; i < 5; i++){
            int rowSum =0;
            for(int j = 0; j < 6; j++)
            {

                System.out.print(array[i][j] + "\t");
                rowSum += array[i][j];
            }
            System.out.println(" | Sum of row " + i + ": " + rowSum);
    }
}}
