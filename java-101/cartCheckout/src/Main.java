import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear, apple, tomato, banana, eggplant, total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many kilograms of pears: ");
        pear = scanner.nextDouble() * 2.14;
        System.out.print("How many kilograms of apples: ");
        apple = scanner.nextDouble() * 3.67;
        System.out.print("How many kilograms of tomatoes: ");
        tomato = scanner.nextDouble() * 1.11;
        System.out.print("How many kilograms of bananas: ");
        banana = scanner.nextDouble() * 0.95;
        System.out.print("How many kilograms of eggplant: ");
        eggplant = scanner.nextDouble() * 5.00;

        total = pear + apple + tomato + banana + eggplant;

        System.out.println("Total amount: " + total + "₺");
    }
}