import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your math exam result: ");
        math = scan.nextInt();
        System.out.print("Enter your physics exam result: ");
        physics = scan.nextInt();
        System.out.print("Enter your chemist exam result: ");
        chemistry = scan.nextInt();
        System.out.print("Enter your turkish exam result: ");
        turkish = scan.nextInt();
        System.out.print("Enter your history exam result: ");
        history = scan.nextInt();
        System.out.print("Enter your music exam result: ");
        music = scan.nextInt();

        if (0 <= math && math <= 100 &&
                0 <= physics && physics <= 100 &&
                0 <= chemistry && chemistry <= 100 &&
                0 <= turkish && turkish <= 100 &&
                0 <= history && history <= 100 &&
                0 <= music && music <= 100) {
            int totalResult = math + physics + chemistry + turkish + history + music;
            float average = (float) totalResult / 6;

            if (average >= 55) {
                System.out.print("You graduated with " + average + " points.");
            } else {
                System.out.println("You didn't graduated!");
            }
        } else {
            System.out.println("Error! Please enter a value between 0 and 100.");
        }
    }
}