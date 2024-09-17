public class inverted_HalfPyramid180degeInverted {
    public static void main(String[] args) {
        int n = 5;

        //Outer loop for rows
        for(int i=1; i<=n; i++){

            //loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //loop for stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
