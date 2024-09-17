import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

    //    for(int counter = 0; counter < 11; counter++){            // FOR LOOP  ,,,,
    //        System.out.println(counter+" ");
    //    }

        // for(int i=0; i<11; i++){
        //     System.out.println(i);
        // }


                                                                // WHILE LOOP,,,,

        // int i=0;
        // while(i<11){
        //     System.out.println(i);
        // //     i++;
        // }
                                                                // DO WHILE
        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while(i<11);

            // int sum = 0;
            // for(int i=0; i<=n; i++) {
            //     sum = sum + i;
            // }System.out.println(sum);

        
        // for(int i=1; i<11; i++) {                   // for printing tables, e.g 2 to 10...
        //     System.out.println(i*n);
        // }

        // int i = 1;
        // while(i<11) {
        //     System.out.println(i*n);
        //     i++;
        // }

        int i =1;
        do {
            System.out.println(i*n);
            i++;
        }while(i<11);
    }
}
