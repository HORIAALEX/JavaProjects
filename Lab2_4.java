import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(arr[i][0]==0)
                        for(int k=0; k<m; k++)
                            arr[i][k] = 0;
                    else continue;
                }

            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.println(arr[i][j]+" ");
                }
            }
        } catch(InputMismatchException e){
            System.out.println("Invalid input >> Please input a valid number");
        }
    }
}
