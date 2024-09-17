import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pass th N ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        System.out.println("Enter the elements of array ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        System.out.print("Enter x - ");
        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.err.println(numbers[i] +" found at index "+ i);
            }
        }
    }
}
