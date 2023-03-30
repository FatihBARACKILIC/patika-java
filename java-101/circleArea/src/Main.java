import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double area, perimeter, radius, a, centerAngle;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        radius = scanner.nextDouble();
        System.out.print("Enter center angle: ");
        a = scanner.nextDouble();

        area = Math.PI * radius * radius;
        perimeter = Math.PI * 2 * radius;
        centerAngle = (Math.PI * (radius * radius) * a) / 360;

        System.out.println("Area of the Circle: " + area);
        System.out.println("Perimeter of the Circle: " + perimeter);
        System.out.println("Center Angle of the Circle: " + centerAngle);
    }
}