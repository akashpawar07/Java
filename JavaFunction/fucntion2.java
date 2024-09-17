import java.util.*;

public class fucntion2{

    public static int sum(int a, int b){
        // int product =  a+b;
        return a+b;
    }
    public static int product(int a, int b){
        // int product =  a+b;
        return a*b;
    }
    public static int subtraction(int a, int b){
        // int product =  a+b;
        return a-b;
    }
    public static int divide(int a, int b){
        // int product =  a+b;
        return a/b;
    }
    public static int reminder(int a, int b){
        // int product =  a+b;
        return a%b;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the a : ");
    int a = sc.nextInt();

    System.out.print("Enter the b : ");
    int b = sc.nextInt();

    // int product;
    // product(a, b);
    // product = a*b;
    System.out.println("sum of two numbers is :" + sum(a, b));
    System.out.println("Product of two numbers is :" + product(a, b));
    System.out.println("divide of two numbers is :" + divide(a, b));
    System.out.println("subtraction of two numbers is :" + subtraction(a, b));
    System.out.println("Reminder of two numbers is :" + reminder(a, b));

    }
}
