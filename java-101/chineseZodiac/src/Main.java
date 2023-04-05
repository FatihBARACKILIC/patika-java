import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = 0;
        String zodiac;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        year = scanner.nextInt();

        switch (year % 12) {
            case 0 -> zodiac = "Monkey";
            case 1 -> zodiac = "Rooster";
            case 2 -> zodiac = "Dog";
            case 3 -> zodiac = "Pig";
            case 4 -> zodiac = "Rat";
            case 5 -> zodiac = "Ox";
            case 6 -> zodiac = "Tiger";
            case 7 -> zodiac = "Rabbit";
            case 8 -> zodiac = "Dragon";
            case 9 -> zodiac = "Snake";
            case 10 -> zodiac = "Horse";
            case 11 -> zodiac = "Goat";
            default -> zodiac = "";
        }
        if (zodiac.length() > 0)
            System.out.println("Your Chinese Zodiac is " + zodiac);
        else
            System.out.println("You entered wrong value.");


    }
}