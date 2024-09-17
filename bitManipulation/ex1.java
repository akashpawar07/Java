package bitManipulation; 


//Get
public class ex1 {
    public static void main(String[] args) {
     int n = 5; // 0101
     int position = 3;
     int bitMask = 1<<position;  // 1<<3

     if((bitMask & n)==0){
        System.out.println("Bit was 0");
     }else{
        System.out.println("Bit was 1");
     }
    }
}


//Get
// public  class ex1 {
//     public static void main(String[] args) {
//         int n = 5; // 0101
//         int position = 2;
//         int bitMask = 1<<position;  // 1<<2

//         if((bitMask & n)==0){
//             System.out.println("Bit was 0");
//         }else{
//             System.out.println("Bit was 1");
//         }
//     }
// }



//Set
// public  class ex1 {
//     public static void main(String[] args) {
//         int n = 5; // 0101
//         int position = 1;
//         int bitMask = 1<<position;

//         int newNumberr = bitMask | n;
//         System.out.println(newNumberr);   //  7 is decimal of = 0111
//     }
// }


// Clear
// public  class ex1 {
//     public static void main(String[] args) {
//         int n = 5; // 0101
//         int position = 2;
//         int bitMask = 1<<position;
//         int notBitmask = ~(bitMask);

//         int newNumberr = notBitmask & n;
//         System.out.println(newNumberr);   //Ans 1 is decimal of = 0001
//     }
// }


// Update
public  class ex1 {
    public static void main(String[] args) {
        int n = 5; // 0101
        int position = 2;
        int bitMask = 1<<position;
        int notBitmask = ~(bitMask);

        int newNumberr = notBitmask & n;
        System.out.println(newNumberr);   //Ans 1 is decimal of = 0001
    }
}