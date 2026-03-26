package Two_pointer;

public class traping_water {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        int n = arr.length;

        int left = 0;
        int right = n - 1;
        int left_max = 0;
        int right_max = 0;
        int trappedWater = 0;

        while (left < right) {

            if (arr[left] < arr[right]) {

                if (arr[left] >= left_max) {
                    left_max = arr[left];
                } else {
                    trappedWater += left_max - arr[left];
                }
                left++;

            } else {

                if (arr[right] >= right_max) {
                    right += arr[right];
                } else {
                    trappedWater += right_max - arr[right];
                }
                right--;

            }
        }

        System.out.println("Traped water count is: " + trappedWater);
    }
}
