public class Main {
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while (i < j)
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        return true;
    }

    public static boolean isPalindrome2(String str) {
        str = str.toLowerCase();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        //! Way 1
        System.out.println(isPalindrome("Kavak"));
        System.out.println(isPalindrome("kayak"));
        //! Way 2
        System.out.println(isPalindrome2("Kavak"));
        System.out.println(isPalindrome2("Abba"));
    }
}