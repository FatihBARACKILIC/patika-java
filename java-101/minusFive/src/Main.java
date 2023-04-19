import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isContinue;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            minusFive(number, number, true);

            System.out.print("\nIs continue (true | false): ");
            isContinue = scanner.nextBoolean();
        } while (isContinue);
    }

    static void minusFive(int number, int temp, boolean isDecrease) {
        System.out.print(number + " ");
        if (isDecrease && number > 0) {
            minusFive(number - 5, temp, true);
        } else {
            if (temp > number) {
                minusFive(number + 5, temp, false);
            }
        }

    }
}