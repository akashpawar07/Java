import java.util.*;


public class elseif {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Press the button : ");
            int button = sc.nextInt();

            if (button == 1) {
                System.out.println("NAMASTE");
            } else if (button == 2) {
                System.out.println("JAY SHREE RAM");
            } else if (button == 3) {
                System.out.println("Welcome");
            } else {
                System.out.println("You have preesed Invalid button");
            }
        }

        // System.out.println("Enter the Age :");
        // int age = sc.nextInt();
        // if (age < 14) {
        // System.out.println("You can't vote - Because of you're under 18 ");
        // } else if (age <= 50) {
        // System.out.println("You can Vote");
        // } else {
        // System.out.println("Sorry Invalid Age");
        // }

    }
}
