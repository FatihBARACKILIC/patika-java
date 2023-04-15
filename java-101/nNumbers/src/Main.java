import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, greatestNumber = 0, smallestNumber = 0, tempNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number you will enter: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + i + ". number: ");
            tempNumber = scanner.nextInt();
            if (i == 1) {
                greatestNumber = tempNumber;
                smallestNumber = tempNumber;
            } else if (tempNumber > greatestNumber) {
                greatestNumber = tempNumber;
            } else if (tempNumber < smallestNumber) {
                smallestNumber = tempNumber;
            }
        }

        System.out.println("The greatest number is: " + greatestNumber);
        System.out.print("The smallest number is: " + smallestNumber);
    }
}
