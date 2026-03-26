package Two_pointer;

import java.util.HashMap;
import java.util.Map;

//unique pairs who;s sum is equals to target

public class twoSumWithDuplicates {

    public static Map<Integer, Integer> twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> unique_pairs = new HashMap<>();

        int left = 0; // left pointer
        int right = arr.length - 1; // right pointer
        int currentSum = 0;

        // while loop run until both pointer cross each other or became equals in array
        while (left <= right) {
            currentSum = arr[left] + arr[right];

            // if pairs sum matches with target then store them in hashmap
            if (currentSum == target) {
                unique_pairs.put(arr[left], arr[right]);
                left++;
                right--;
            }
            // increment left if its previous element is same as current one
            while (arr[left] == arr[left - 1]) {
                left++;
            }
            // decrement right if its next element is same as current one
            while (arr[right] == arr[right + 1]) {
                right--;
            }

            // if current sume is less than target increase the left pointer (left++), else descrease the right pointer (right--)
            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        // return the unique pairs as result
        return unique_pairs;

    }

    public static void main(String[] args) {
        int[] numbers = { 1, 1, 1, 2, 2, 3, 3, 3};
        int target = 4;

        Map<Integer, Integer> reults = twoSum(numbers, target);
        if (!reults.isEmpty()) {
            System.out.println("Unique pairs who's sum is 4: " + reults);
        } else {
            System.out.println("map is empty");
        }
    }
}
