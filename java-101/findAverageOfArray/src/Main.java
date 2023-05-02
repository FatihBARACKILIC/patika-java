public class Main {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5,6};
        double total = 0;
        for (int number : numberArray) {
            total += number;
        }

        System.out.println("Average: " + (total / numberArray.length));
    }
}