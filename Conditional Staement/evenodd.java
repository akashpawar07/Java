import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the No :");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                System.out.println("Equal");
            } else {
                if (a > b) {
                    System.out.println("A is grater");
                } else {
                    System.out.println("A is lesser");
                }
            }
        }


        // Questions :- Check the given number is Even Or Odd.................................(e.g)
        
        // System.out.println("Enter the No :");
        // int a = sc.nextInt();
        // if (a % 2 == 0) {
        // System.out.println("even");
        // } else {
        // System.out.println("odd");
        // }
        // }

    }
}
