import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            boolean isPrimeNumber = isPrime(number, 2);
            if (isPrimeNumber)
                System.out.println(number + " is a prime number.");
            else {
                System.out.println(number + " is not a prime number.");
            }
            System.out.print("Is continue (true | false): ");
            isContinue = scanner.nextBoolean();
        } while (isContinue);
    }

    public static boolean isPrime(int n, int divisor) {
        if (n == 0 || n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (divisor <= n / 2) {
            return n % divisor != 0 && isPrime(n, divisor + 1);
        } else {
            return n % divisor != 0;
        }
    }
}