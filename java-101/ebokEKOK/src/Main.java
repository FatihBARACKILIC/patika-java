import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, ebob = 1, ekok;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();

        int i = 1;
        while (i <= firstNumber && i <= secondNumber) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (firstNumber * secondNumber) / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.print("EKOK: " + ekok);
    }
}