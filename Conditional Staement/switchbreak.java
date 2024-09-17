import java.util.Scanner;

public class switchbreak {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Press the button :");
            int button =sc.nextInt();

            switch (button) {
                case 1:
                    System.out.println("Namaste");
                    break;
                case 2:
                    System.out.println("hallow");
                    break;
                case 3:
                    System.out.println("welcome");
                    break;
                default:
                    System.out.println("Invalid button");
            }
        }
    }
}
