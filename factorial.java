import java.util.Scanner;


public class factorial {

    public static int facto(int n){
        if(n==0 || n ==1){
            return 1;
        }else{
            return n*facto(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial : ");
        int num = sc.nextInt();

        //calling factorial class
        int result = facto(num);
        System.out.println("Factorial of " + num +" is : "+ result);
    }

   
}
