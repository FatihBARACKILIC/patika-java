import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, weight, bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height: ");
        height = scanner.nextDouble();
        System.out.print("Please enter your weight: ");
        weight = scanner.nextDouble();

        if (height > 2.5) {
            height /= 100;
        }

        bmi = weight / (height * height);
        System.out.println("Your BMI: " + bmi);
    }
}