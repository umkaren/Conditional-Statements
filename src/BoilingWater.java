import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");

        int number = Integer.valueOf(scanner.nextLine());

        if (number >= 212) {
            System.out.println("Water is boiling!");
        }
    }
}
