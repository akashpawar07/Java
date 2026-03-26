public class findGCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 30;
        int result = find_GCD(a, b);
        System.out.println("The GCD is: " + result);

    }
 
    public static int find_GCD(int a, int b) {
        int smallest = Math.min(a, b);
        int gcd = 1;

        for (int i = 1; i < smallest; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
