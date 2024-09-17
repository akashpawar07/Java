import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age");
        int age = sc.nextInt();
        if(age>70) {
            System.out.println("Envalid Age");
        }else if (age>18) {
                System.out.println("You can vote");
            }else {
                System.out.println("You can not vote");
            }
    }
}
