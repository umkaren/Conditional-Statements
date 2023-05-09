import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
        int input = Integer.valueOf(scanner.nextLine());

        if (input >= 90 && input <= 100) {
            System.out.println("Your grade is an A! :)");
        } else if (input < 90 && input >= 80) {
            System.out.println("Your grade is a B. :)");
        } else if (input < 80 && input >= 70) {
            System.out.println("Your grade is a C. :|");
        } else if (input < 70 && input >= 60) {
            System.out.println("Your grade is a D. :(");
        } else if (input < 60 && input >= 0) {
            System.out.println("Your grade is an F. ;_;");
        } else {
            System.out.print("Invalid entry. Please enter a number between 0 and 100");
        }
    }
}
