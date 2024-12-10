import javax.swing.*;
import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        int vCount = 0, cCount = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                vCount++;
            else
                cCount++;

        }
        System.out.println("The number of vocals: " + vCount);
        System.out.println("The number of consonants: " + cCount);
    }
}
