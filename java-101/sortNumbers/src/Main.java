import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you will enter: ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter " + (i + 1) + ". number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(sortArray(numbers)));
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int tempIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[tempIndex] > arr[j])
                    tempIndex = j;
            }
            int temp = arr[tempIndex];
            arr[tempIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}