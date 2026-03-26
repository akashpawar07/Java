package sorting.bubbleSort;

public class bubbleSort {
    public static void main(String[] args) {

        int nums[] = {0, 22,3, 5, 2, 1, 77, 4, 9 };

        System.out.println("Befor sorting : ");
        for (int numbers : nums) {
            System.out.print(numbers + " ");
        }

        // sorting logic 
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swaping the numbers
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                
            }
        }

        System.out.println("");
        System.out.println("After sorting : ");
        for (int numbers : nums) {
            System.out.print(numbers + " ");
        }

    } 
}
