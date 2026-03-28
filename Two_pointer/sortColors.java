package Two_pointer;

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 2, 0};
        
        int low = 0;
        int high = arr.length-1;
        int mid  = 0;
        
        while (mid <= high) {
            
            if(arr[mid] ==0){
                //swap mid with low
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;
            else {
                //swap mid with high;
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
        System.out.print("Sorted colors: "+ Arrays.toString(arr));
    }
}
