import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.print(number + " is a perfect number.");
        } else {
            System.out.print(number + " is not a perfect number.");
        }
    }
}