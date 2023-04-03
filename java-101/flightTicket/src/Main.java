import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        double discount = 1, result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        km = scanner.nextInt();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        type = scanner.nextInt();

        if (0 < km && 0 < age && (type == 1 || type == 2)) {
            if (age <= 12) {
                discount -= .5;
            } else if (age <= 24) {
                discount -= .1;
            } else if (65 <= age) {
                discount -= .3;
            }
            result = (km * .1) * discount;
            if (type == 2) {
                result = (result * 2) * .8;
            }
            System.out.print("Total: " + result);
        } else {
            System.out.print("Wrong value. Please enter valid value.");
        }
    }
}