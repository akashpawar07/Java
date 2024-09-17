public class pattern2 {
    public static void main(String[] args) {
        
        // inverted half pyramid
        // int n = 7; 
        // for(int i=n; i>0; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("display shows done");








        int n = 5;
        for (int i = 1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
