// question : Given an array of integer nums and integer K, return the totatl number of subarrray who's sum is equals to K. Subarray is a continous nonn-empty squence of elements within an array 

package infosys_questions;


import java.util.*;

public class SubarrayEqualsK {

    public static int[] twoSum(int number[], int k) {
        int left = 0;
        int right = number.length - 1;
        int sum = 0;

        while (left < right) {
            sum = number[left] + number[right];

            if (sum == k) {
                System.out.println("indices "+left+", "+ right);
                System.out.println("values "+number[left]+", "+number[right]);
                return new int[] { left, right };
            }
            if (sum > k)
                right--;
            else
                left++;

        }
        return new int[] {};
    }

    public static void main(String args[]) {

        int k = 3;
        int[] number = { 1, 2, 3 };

        twoSum(number, k);
    }

}

// The time complexity of the above code is O(n^2) - because the Outer loop is
// running n times, and simillary Inner loop is running from i to less than nums
// length, its means it also running n times,
// there the time complexity is O(n^2)
