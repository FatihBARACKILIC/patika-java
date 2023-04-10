import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, nResult = 1, rResult = 1, dResult = 1;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements of the set: ");
        n = scanner.nextInt();

        System.out.print("Enter the number of elements of the groups: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            nResult *= i;
        }

        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            dResult *= i;
        }

        result = (double) nResult / (rResult * dResult);

        System.out.print("Result: " + result);


    }
}