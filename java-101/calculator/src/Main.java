import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber, secondNumber, processType;
        double result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextInt();
        System.out.print("1 = Addition\n2 = Subtraction\n3 = Multiplication\n4 = Division\n: ");
        processType = scanner.nextInt();

        switch (processType) {
            case 1 -> result = firstNumber + secondNumber;
            case 2 -> result = firstNumber - secondNumber;
            case 3 -> result = firstNumber * secondNumber;
            case 4 -> result = (double) firstNumber / secondNumber;
        }

        System.out.println("Result: " + result);
    }
}
