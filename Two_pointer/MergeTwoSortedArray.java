// Question : Merge two sorted an Array's

package Two_pointer;

import java.util.ArrayList;

public class MergeTwoSortedArray {

    public static void mergeTwoArray(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int index = 0;

         while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[index] = nums1[i];
                index++;
                i++;
            }else{
                result[index] = nums2[j];
                index++;
                j++;
            }
        }

        while(i<m){
            result[index] = nums1[i];
            index++;
            i++;
        }

        while(j<n){
            result[index] = nums2[j];
            index++;
            j++;
        }

        for (int elem : result) {
            System.out.print(elem + " ");
        }

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5 };
        int[] nums2 = { 2, 4, 6 };

        mergeTwoArray(nums1, nums2);
    }
}
