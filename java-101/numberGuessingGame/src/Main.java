import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
//        int number = (int) Math.floor(Math.random() * 100);

        System.out.println(number);

        Scanner scanner = new Scanner(System.in);

        int right = 0;
        int[] wrongGuesses = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Enter your guess: ");
            int selected = scanner.nextInt();

            if (selected < 0 || 99 < selected) {
                System.out.println("Please enter a number between 0 and 100!");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("If you make a wrong entry again, your remaining guess rights will be reduced!");
                    continue;
                }

            }

            if (selected == number) {
                System.out.print("Congratulations, Correct Guess! You Win!");
                isWin = true;
                break;
            } else {
                System.out.println("Wrong guess!");
                if (selected < number) {
                    System.out.println("Enter bigger number than you guessed!");
                } else {
                    System.out.println("Enter smaller number than you guessed!");
                }
                wrongGuesses[right++] = selected;
                System.out.println("Your remaining guess: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You Lost!");
            System.out.println("Your guesses: " + Arrays.toString(wrongGuesses));
        }
    }
}