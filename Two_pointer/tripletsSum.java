// Question : find the cont of triplets (i, j, k), having with sum of (arr[i] + arr[j] + arr[k])
// samller than given sum value;

package Two_pointer;

import java.util.*;

public class tripletsSum {
    public static long findTripletSumCount(int[] arr, int n, int sum) {

        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                long currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum < sum) {
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("pass the size of array: ");
        int n = sc.nextInt();

        System.out.print("now enter the arrays elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] += sc.nextInt();
        }

        
        // int[] array = {-2, 0, 1, 3};
        // int n = 4;

        int sum = 2;
        long result = findTripletSumCount(arr, n, sum);
        System.out.println(result+": Triplets paris who's sum is less than given sum");
    }
}
