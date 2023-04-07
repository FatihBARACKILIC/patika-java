import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0, number, evenNumbersTotal = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            total += number;
            if(number % 4 == 0) {
                evenNumbersTotal += number;
                System.out.println(number + " - " + evenNumbersTotal);
            }
        }while (number % 2 == 0);
        System.out.println("Sum of numbers: " + total);
    }
}