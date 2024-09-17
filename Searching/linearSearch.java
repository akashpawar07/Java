
/* (Que) Take an array as input from the user, 
Search for a given number y and print the index at which it occurs. */


package Searching;
import java.util.Scanner;

class linearSearch {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the SIZE of array : ");
        int size = sc.nextInt();

        // Array initialization
        int numbers[] = new int[size];

        //input of an array
        System.out.println("Enter the an array elements - ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        System.out.print("Enter the Y = ");
        int y = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]== y){
                System.out.println(numbers[i] +" found at Index"+ i);
            }
        }
    }
    
 }