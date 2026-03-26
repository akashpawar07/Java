package Two_pointer;

import java.util.*;

public class sortedSquareArray {

    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = result.length - 1; // Fill from largest to smallest

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {-4, -1, 0, 3, 10 };

        int[] res = sortedSquares(array);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
