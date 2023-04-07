import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the max number: ");
        maxNumber = scanner.nextInt();

        for (int i = 1; i <= maxNumber; i++) {
            if (i % 4 == 0 && i % 5 == 0)
                System.out.println(i + " is divisible by both 4 and 5 without a remainder.");
            else if (i % 4 == 0)
                System.out.println(i + " is divisible by 4 without a remainder.");
            else if (i % 5 == 0)
                System.out.println(i + " is divisible by 5 without a remainder.");
        }
    }
}