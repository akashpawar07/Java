
// Print the Product of two Integers using fuction.......


import java.util.*;
public class calculate_Product {

    public static int calculate_Product(int a, int b){
        return a*b;
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter A : ");
    int A = sc.nextInt();

    System.out.print("Enter B : ");
    int B = sc.nextInt();

    System.out.println("Product of two numbers - "+ calculate_Product(A, B));
  }
}

/*Outout : 
        Kindly Enter A and B :
            --pass a  as your input...
            --pass b  as your input...

        Product of tow integers is :
            --output depends upon your input as you have passed...
*/
