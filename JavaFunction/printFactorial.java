
// Print the factorial using fucntion ...


import java.util.*;
public class printFactorial {

    public static void printFactorial(int n ){    // new function user defined
      
        if (n < 0){
            System.out.println("Invalid ");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {  // main function in-built
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter N :");
        int n = sc.nextInt();

        printFactorial(n);

    }
}

/*  Output : 
        Enter N :
            -- pass N 
            -- (if you pass eg. 5 then factorial is 120)

 */

