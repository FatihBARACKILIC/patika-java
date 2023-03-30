import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, perimeter;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first edge: ");
        a = scanner.nextInt();
        System.out.print("Enter the second edge: ");
        b = scanner.nextInt();
        System.out.print("Enter the third edge: ");
        c = scanner.nextInt();

        perimeter = a + b + c;
        area = (double) (a * b) / 2;

        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Area of the triangle: " + area);
    }
}