public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(101));
        System.out.println(isPalindromeNumber(102));
        System.out.println(isPalindromeNumber(665566));

    }

    static boolean isPalindromeNumber(int number) {
        int temp = number, reverseNumber = 0;
        while (temp > 0) {
            reverseNumber = (reverseNumber * 10) + (temp % 10);
            temp /= 10;
        }

        return reverseNumber == number;
    }
}