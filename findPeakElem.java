public class findPeakElem {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 3, 2, 0};
        int res = find_peak_elment(arr);
        System.out.println(res);
    }

    public static int find_peak_elment(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left ) / 2 ;
            System.out.println(mid);
            if(arr[mid] > arr[mid + 1]){
                right = mid;
            }else {
                left = mid + 1;
            }
        }

        return left;
    }
}
