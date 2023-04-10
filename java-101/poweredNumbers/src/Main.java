import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, power, result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.print("Enter power of " + number + ": ");
        power = scanner.nextInt();
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        System.out.print("Result of " + number + " ^ " + power + ": " + result);
    }
}