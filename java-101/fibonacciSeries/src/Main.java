import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, firstNumber = 0, secondNumber = 1, number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        System.out.print(firstNumber + " " + secondNumber);

        for (int i = 2; i <= n; i++) {
            number = firstNumber + secondNumber;
            System.out.print(" "+ number);
            firstNumber = secondNumber;
            secondNumber = number;
        }
    }
}