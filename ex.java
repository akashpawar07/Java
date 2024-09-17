class example{
    public static void main(String[] args) {

        System.out.println("Display Screen");
        for(int i=0; i<=7; i++){      // 0 1 2
            for(int j=0; j<=i; j++){   // 0+0=0, 1+1=2, 
                System.out.print(" ");
                System.out.print(i+j);
            }
            System.out.println();
        }
        System.err.println("Screen display done.");
    }
}
