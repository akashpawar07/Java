import java.util.Scanner;

public class cubesOfNubers {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("pass a: ");
    int a = sc.nextInt();
    System.out.print("pass b: ");
    int b = sc.nextInt();
    long sum = 0;

    for(int i=a; i<=b; i++){
        sum += i*i*i;
    }
    System.out.println("Sum of cubes: "+sum);
 }   
}
