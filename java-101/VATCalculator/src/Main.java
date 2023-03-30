import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount, totalPayment;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount: ");
        amount = scan.nextDouble();

        if (0 <= amount && amount <= 1000) {
            totalPayment = amount * 1.180;
        } else {
            totalPayment = amount * 1.080;
        }

        System.out.println(totalPayment);
    }
}