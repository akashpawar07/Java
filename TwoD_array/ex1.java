package TwoD_array;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take two variables as input. rows and columns
        System.out.println("Enter the no.of rows and no.of column");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // initialize of 2D array
        System.out.println("Enter the 2d array elements");
        int numbers[][] = new int[rows][cols];

        // get input for 2Darrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Pass thee X : ");
        int x = sc.nextInt();

        //output

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println(numbers[i][j] +" found at index" + "("+i +","+ j+")");
                }
            }
        }
    }
}
