
/* (Que) Take an array as input from the user, 
Search for a given number y and print the index at which it occurs. */

package Searching;

import java.util.Scanner;

class linearSearch1 {

    public static void main(String[] args) {

        // Array initialization
        // int arr[] = new int[100];
        int arr[] = { 4, 5, 6, 7, 9, 11 };
        int target = 7;
        int result = linearSearch(arr, target);
        System.out.println("Element found at Index : " + result);
    }

    public static int linearSearch(int arr[], int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("steps taken by linear search : " + steps);
                return i;
            }
        }
        System.out.println("steps taken by linear search : " + steps);
        return -1;
    }
}