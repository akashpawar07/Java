import java.util.*;

class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter size of array");

        int size = sc.nextInt();
        int number[] = new int[size];

        
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Array size is :");
        
        for (int i=0; i<size; i++) {
            System.out.println(number[i]);
        }
    }
}