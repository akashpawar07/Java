

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size: ");
        int size = sc.nextInt();

        System.out.print("enter element in array: ");
        int[] arr = new int[size];

        // storing inputs in array
        for (int i = 0; i < size; i++) {
            arr[i] += sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];

            left++;
            right--;

        }

        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
}
