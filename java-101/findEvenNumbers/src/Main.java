import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        maxNumber = scanner.nextInt();

        for (int i = 0; i <= maxNumber; i += 2)
            System.out.print(i + " ");

        System.out.println();

        for (int i = 0; i < maxNumber; i++) {
            if(i % 3 == 0 && i % 4 == 0)
                System.out.print(i +" ");
        }
    }
}