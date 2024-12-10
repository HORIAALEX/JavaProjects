import java.util.*;

public class Lab2_6 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 2, 3};
        System.out.println(dup2(array));

    }

    public static int dup1(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : array)
        {
            Integer i=a;
            if(set.contains(a)) return a;
            else
                set.add(i);
        }
        return 0;
    }

    public static int dup2(int[] array) {
        boolean[] found = new boolean[array.length-1];
        for(int a : array)
        {
            if(found[a-1]) return a;
            else found[a-1] = true;
        }
        return 0;
    }

}