public class butterflyPattern {
    public static void main(String[] args) {
        

     //Upper Half ..................
        int n=5; 
        for(int i=1; i<=n; i++){
            // 1st part ..................................
            for(int j=1; j<=i; j++){
                System.out.print("*" +" ");
            }

            // spacess ....................................
            int spacess = 2*(n-i);
            for(int k=1; k<=spacess; k++){
                System.out.print(" "+" ");
            }

            // // 2nd part .................................
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


     // lower half.......................................
        for(int i=n; i>=1; i--){
            // 1st part ....................................
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            // spacess ....................................

            int spacess = 2*(n-i);
            for(int k=1; k<=spacess; k++){
                System.out.print(" "+" ");
            }

            // // 2nd part .................................

            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}
