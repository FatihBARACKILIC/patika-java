import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, temp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Second Number: ");
        secondNumber = scanner.nextInt();
        System.out.print("Third Number: ");
        thirdNumber = scanner.nextInt();


        if (thirdNumber < firstNumber) {
            temp = thirdNumber;
            thirdNumber = firstNumber;
            firstNumber = temp;
        }
        if (thirdNumber < secondNumber) {
            temp = thirdNumber;
            thirdNumber = secondNumber;
            secondNumber = temp;
        }
        if (secondNumber < firstNumber) {
            temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }

        System.out.println(firstNumber + " < " + secondNumber + " < " + thirdNumber);
    }
}