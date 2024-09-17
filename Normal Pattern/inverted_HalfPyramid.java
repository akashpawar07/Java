public class inverted_HalfPyramid {
    public static void main(String[] args) {
        int n = 7;

        //outer loop for rows
        for(int i=n; i>=1; i--){
            //inner loop for columns 
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
              System.out.println();
        }
    }
}
/* Inverted Half-pyramid 

    * * * * * * * 
    * * * * * * 
    * * * * * 
    * * * * 
    * * * 
    * * 
    * 

 */
