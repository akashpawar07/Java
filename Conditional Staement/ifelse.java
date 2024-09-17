import java.util.*;;

public class ifelse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Check the age is 18 is Adult or Not
            // Adult...................................(e.g -1)
            System.out.println("Enter the Age :");
            int age = sc.nextInt();

            if (age > 18) {
                System.out.println("adult");
            } else {
                System.out.println("not adult");
            }
        }
    }

    // to check the nnumbers given below are they 'even' or
    // 'odd'....................(e.g -2)
    // int a = sc.nextInt();
    // if (a % 2 == 0) {
    // System.out.println("Even");
    // } else {
    // System.out.println("Odd");
    // }

    // variables are given below 'a' 'b' check they Equal, lesser or
    // Greater................(e.g -3)

    // System.out.println("Enter the No :");
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // if (a == b) {
    // System.out.println("Equal");
    // } else {
    // if (a > b) {
    // System.out.println("A is grater");
    // } else {
    // System.out.println("A is lesser");
    // }
    // }
}
