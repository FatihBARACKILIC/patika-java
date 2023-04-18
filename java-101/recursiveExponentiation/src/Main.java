import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isContinue = true;

        do {

            System.out.print("Enter base number: ");
            int baseNumber = scanner.nextInt();

            System.out.print("Enter the exponential number: ");
            int exponentialNumber = scanner.nextInt();

            int result = calculateExponentiation(baseNumber, exponentialNumber);
            System.out.println("Result: " + result);

            System.out.print("Do you want to continue(true/false): ");
            isContinue = scanner.nextBoolean();
        } while (isContinue);
    }

    static int calculateExponentiation(int baseNumber, int exponentialNumber) {
        if (exponentialNumber == 1)
            return baseNumber;
        return baseNumber * calculateExponentiation(baseNumber, exponentialNumber - 1);
    }
}