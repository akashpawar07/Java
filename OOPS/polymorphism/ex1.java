package OOPS.polymorphism;

/**
 * ex1
 */

 // method overloading 
class Mathematic {
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(double a, double b){
        return a + b;
    }
}
public class ex1 {
    public static void main(String[] args) {
    //object of class Mathematic
    Mathematic m1 = new Mathematic();

    System.out.println(m1.sum(22, 076));
    System.out.println(m1.sum(79, 043, 12));
    System.out.println(m1.sum(11.32, 0.22));
    }
    
    
}