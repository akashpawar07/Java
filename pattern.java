
public class pattern {
    public static void main(String[] args) {

        // int n = 4;
        // int m = 5;

        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=m; j++){
        // System.out.print("*"+" ");
        // }
        // System.out.println();
        // }

        // output-> solid rectanle

        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        // output -> Hollo rectangle

        // * * * * *
        // *       *
        // *       *
        // * * * * *

        // int n = 5;

        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*"+" ");
        // }
        // System.out.println();
        // }

        // output -> Half pyramid

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // int n = 5;

        // for (int i = 1; i <= n; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

    }
}
