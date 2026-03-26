package Searching;

public class binarySearch {

    public static void main(String[] args) {

        int arr[] = new int[64];
        int target = 10;
        int result = binary_Search(arr, target);
        int result2 = linearSearch(arr, target);



        if (result != -1) {
            System.out.println(target + " Element found at index : " + result);
        } else {
            System.out.println("Element not found ");
        }

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

    static int binary_Search(int arr[], int target) {
        int steps = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            steps++;
            int middleValue = end + (start - end) / 2;

            if (arr[middleValue] == target) {
                System.out.println("Total steps taken by binary : " + steps);
                return middleValue;
            } else if (arr[middleValue] < target) {
                start = middleValue + 1;
            } else {
                end = middleValue - 1;
            }
        }
        System.out.println("Total steps taken by binary : " + steps);
        return -1;
    }
}
