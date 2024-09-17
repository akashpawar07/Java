import java.util.*;
public class solid_Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int n = sc.nextInt();
        System.out.print("Enter the column : ");
        int m = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*"+" ");
            }
        System.out.println();
        }
    }
}

 /* solid rectangle using for loop
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 
*/

