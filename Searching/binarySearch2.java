package Searching;

public class binarySearch2 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 9, 12, 18, 25, 67, 101, 125 };
        int target = 1212;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Taget found at index: " + result);
        } else {
            System.out.println("Sorry target not found");
        }

    }

    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

}
