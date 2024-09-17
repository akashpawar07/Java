package Searching;
import java.util.*;


public class linearSearch2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter columns and rows");
    int cols = sc.nextInt();
    int rows = sc.nextInt();

    int numbers[][] = new int[cols][rows];

    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
        }
    }
    
    System.out.print("Enter any number from 2d array : ");
    int n = sc.nextInt();
    
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            if(numbers[i][j]==n){
                System.out.println(numbers[i][j] + " found at index at " +i+","+j);
            }
        }
    }

   }
}
