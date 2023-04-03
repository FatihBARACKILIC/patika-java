import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String horoscope = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your month of birth: ");
        month = scanner.nextInt();

        System.out.print("Your day of birth: ");
        day = scanner.nextInt();

        if ((22 <= day && 12 == month) || (day <= 21 && month == 1)) {
            horoscope = "Capricorn";
        } else if ((22 <= day && 1 == month) || (day <= 19 && month == 2)) {
            horoscope = "Aquarius";
        } else if ((20 <= day && 2 == month) || (day <= 20 && month == 3)) {
            horoscope = "Pisces";
        } else if ((21 <= day && 3 == month) || (day <= 20 && month == 4)) {
            horoscope = "Aries";
        } else if ((21 <= day && 4 == month) || (day <= 21 && month == 5)) {
            horoscope = "Taurus";
        } else if ((22 <= day && 5 == month) || (day <= 22 && month == 6)) {
            horoscope = "Gemini";
        } else if ((23 <= day && 6 == month) || (day <= 22 && month == 7)) {
            horoscope = "Cancer";
        } else if ((23 <= day && 7 == month) || (day <= 22 && month == 8)) {
            horoscope = "Leo";
        } else if ((23 <= day && 8 == month) || (day <= 22 && month == 9)) {
            horoscope = "Virgo";
        } else if ((23 <= day && 9 == month) || (day <= 22 && month == 10)) {
            horoscope = "Libra";
        } else if ((23 <= day && 10 == month) || (day <= 21 && month == 11)) {
            horoscope = "Scorpio";
        } else if ((22 <= day && 11 == month) || (day <= 21 && month == 12)) {
            horoscope = "Sagittarius";
        }

        if (horoscope.isEmpty()) {
            System.out.println("Error");
        } else {
            System.out.println("You are a " + horoscope);
        }
    }
}