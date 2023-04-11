import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        armstrongNumber(number);

        int temp = number, total = 0;
        while (temp > 0) {
            total += temp % 10;
            temp /= 10;
        }
        System.out.print("The sum of " + number + " number's digits is " + total + ".");

    }

    public static void armstrongNumber(int number) {
        int tempNumber, digit = 0, tempValue, power = 1, total = 0;
        tempNumber = number;

        while (tempNumber > 0) {
            tempNumber /= 10;
            digit++;
        }

        tempNumber = number;
        while (tempNumber > 0) {
            tempValue = tempNumber % 10;
            for (int j = 0; j < digit; j++) {
                power *= tempValue;
            }
            total += power;
            power = 1;
            tempNumber /= 10;
        }

        if (total == number) {
            System.out.print(number + " is an Armstrong number.");
        } else {
            System.out.print(number + " is not an Armstrong number.");
        }
        System.out.println();
    }
}