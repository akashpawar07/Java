import java.util.Scanner;
   
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // try (Scanner sc = new Scanner(System.in)) {

        //     System.out.println("enter the term :");
            
            // int a = sc.nextInt();
        //     int sum = 0;
        //     for (int i = 1; i <= a; i++) {
        //         sum = sum + i;
        //     }
        //     System.out.print("Addition =" + sum);
        // }

        // Print the 1 to 10 names or number by using for loop

        // System.out.println("Pass N :-");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.println("A forever...");
        // }
        // }
                    //  Output:
                    // pass the N :-  LIKE BETWEEN 1 TO 10
                    // A forever...
                    // A forever...
                    // A forever...
                
        // print the sum of first n natural Number.......................(e.g)
        System.out.println("Enter a:");
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=a; i++){
            sum = sum + i;
        }
        System.out.println("Addition is "+sum);
        
        //oUTPUT :- 
        // ENTER THE TERM : LIKE 10
        // ADDITIONS = 55

    }
}
