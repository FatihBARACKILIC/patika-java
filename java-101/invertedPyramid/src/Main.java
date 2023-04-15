import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(" ".repeat(Math.max(0, i)));
            System.out.println("*".repeat(Math.max(0, ((number - i) * 2) - 1)));
        }
    }
}