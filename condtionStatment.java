import java.util.*;

public class condtionStatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     //Ex-1) 
        // System.out.println("Enter the age");
        // int age = sc.nextInt();                      // If-else Statment
        // if (age> 18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }

     //Ex-2)
        // System.out.println("Enter the Number");
        // int x = sc.nextInt();
        // if(x % 2 ==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }



     //Ex-3) 
         // int a = sc.nextInt();                                //If-else Statment
        // int b = sc.nextInt();

        // if(a == b) {
        //     System.out.println("Equal");
        // }else {
        //     if(a > b) {
        //         System.out.println("a is Gratter");
        //     }else {
        //         System.out.println("a is Lesser");
        //     }
            
        // }

     //Ex-4)                                                     //else-if statement
        
        // System.out.println("Enter your age");-
        // int age = sc.nextInt();
            
        // if(age>100){
        //     System.out.println("Envalid Age");
        // }else if (age>18){
        //     System.out.println("You can vote");
        // }else{
        //     System.out.println("You can not vote");
        // }


        System.out.println("Enter the Botton :");
        int button = sc.nextInt();
        if(button==1) {
            System.out.println("Hello");
        }else if (button==2) {
            System.out.println("Namaste");
        }else if (button==3) {
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Envalid Button");
        }
    
    }
}
