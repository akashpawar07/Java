
// Print the Addition of Numbers using function......
import java.util.*;

public class add_Function {

    public static int addFunction(int a, int b) {
        return a+b;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A :");
        int a = sc.nextInt(); 

        System.out.print("Enter B :");
        int b = sc.nextInt();

        int sum = addFunction(a, b);
        System.out.println("The SUM is - " + sum);
        
    }
}

/*Outout : 
        Enter A and B :
            --pass a  as your input...
            --pass b  as your input...

        Sum of tow integers is :
            --output depends upon your input that you have passed in parameter...

*/