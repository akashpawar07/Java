
//  Print your Name using fuction ....

import java.util.*;

public class function {

    public static void printInfo(){
        String name;
        int rollNo;
        float marks;
        
        System.out.print(name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name please ");
        String name = sc.next();
        
        int roll = sc.nextInt();
        String Subject = sc.next();

        printInfo();

    }
}

/* Output : 
        Enter your name please 
        sky  <--- your input 
        sky  <--- your output
*/