// ----two pointer example--- 
//Question : Remove the duplicates from given an array, and re-arrange the array

package Two_pointer;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9};

        int officer = nums[0];
        int cm = nums[1];
        ArrayList<Integer> unique = new ArrayList<>();
        
        unique.add(officer);

        while (cm < nums.length) {

            if (nums[cm] == nums[cm - 1]) {
                cm++;
                continue;
            }
            nums[officer + 1] = nums[cm];
            officer++;
            unique.add(nums[officer]);
            cm++;
        }

        System.out.println(unique);
    }
}
