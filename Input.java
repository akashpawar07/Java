import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //input

        System.out.println("Enter the value of A :");
        int a = sc.nextInt();

        System.out.println("Enter the value of B :");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("the sum of A and B is = " +sum);            //output
    }
}
