import java.util.Scanner;

public class findx {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter size of array :");

        int size = sc.nextInt();
        int number[] = new int[size];
        
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Enter x :");
        int x = sc.nextInt();
        
        for(int i=0; i<number.length; i++){
            if(number[i]==x){
                System.out.println(number[i]+"found at array index :"+i);
            }
        }
    }
}
