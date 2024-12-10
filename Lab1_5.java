import java.util.Random;

public class Lab1_5 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(101);
        }
        int max = 0, maxDifference=0;
        int even=0;
        for (int i = 0; i < 100; i++) {
            {
                if (array[i] % 2 == 0) {
                    even++;
                    if (even > max)
                        max = even;
                } else
                    even = 0;
            }
            {
                if(i<99) {
                    int difference = Math.abs(array[i+1] - array[i]);
                    if (difference > maxDifference)
                        maxDifference = difference
                                ;
                }
            }
        }
        System.out.println(even);
        System.out.println(maxDifference);
    }
}
