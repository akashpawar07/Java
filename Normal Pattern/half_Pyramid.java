import java.util.*;

public class half_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int n = sc.nextInt();
        System.out.print("Enter the col : ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print("*" + " ");
            }
            System.out.println();
        }
    }
}

/* Half Pyramid

    * 
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * * * * * * *
 
 */
