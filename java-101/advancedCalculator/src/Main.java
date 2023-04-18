import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers oyu will enter:");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers you will enter:");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value:");
        int base = scan.nextInt();
        System.out.print("Enter exponent:");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void modeRetrieval() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter mode: ");
        int mode = scanner.nextInt();

        System.out.println("Mode of " + number + " is " + (number % mode));
    }

    static void rectangularArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the long side: ");
        int longSide = scanner.nextInt();

        System.out.print("Enter the short side: ");
        int shortSide = scanner.nextInt();

        System.out.println("Area of rectangle: " + longSide * shortSide);
        System.out.println("Perimeter of rectangle: " + (longSide + shortSide) * 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1 - Addition
                2 - Subtraction
                3 - Multiplication
                4 - Divide
                5 - Exponent Calculation
                6 - Factorial
                7 - Mode Retrieval
                8 - Rectangular Area and Perimeter Calculation
                0 - Log out""";

        do {
            System.out.println(menu);
            System.out.print("Please select action:");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modeRetrieval();
                    break;
                case 8:
                    rectangularArea();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong selection, please try again!.");
            }
        } while (select != 0);


    }
}