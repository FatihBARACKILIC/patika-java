import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lineCount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter line count: ");
        lineCount = scanner.nextInt();

        for (int i = 0, j = 0; i <= lineCount * 2; i++) {
            if (i > lineCount) {
                j--;
                System.out.print(" ".repeat(Math.max(0, lineCount - j)));
                System.out.println("*".repeat(Math.max(0, (j * 2 + 1))));
            } else {
                System.out.print(" ".repeat(Math.max(0, lineCount - i)));
                System.out.println("*".repeat(Math.max(0, (i * 2 + 1))));
                j = i;
            }
        }
    }
}