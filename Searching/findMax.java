package Searching;

public class findMax {
    
    public static void main(String[] args) {
        int array[] = {2,5,1,9,3};
        
        //function call
        int max = findMaxNum(array);
     
        System.out.println("Max in given array: "+ max);
        
    }

    public static int findMaxNum(int arr[]){
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
        
    }
}
