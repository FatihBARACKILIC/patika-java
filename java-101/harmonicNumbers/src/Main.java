import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        double result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N number:");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            result += (double) 1 / i;
        }

        System.out.print("Result: " + result);
    }
}