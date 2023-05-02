import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numberArr = {10, -2, 999, 0, 50, 53, 72, -81, 9, -95};
        System.out.println("Array: " + Arrays.toString(numberArr));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int enteredNumber = scanner.nextInt();

        findMaxAndMin(numberArr, enteredNumber);
    }

    public static void findMaxAndMin(int[] arr, int enteredNumber) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, enteredNumber);

        if (index < 0) {
            System.out.println("There is no " + enteredNumber + " in the array");
        } else {
            if (0 < index && index < arr.length) {
                System.out.println("The nearest small number in the array: " + arr[index - 1]);
            } else {
                System.out.println(enteredNumber + "is the smallest number");
            }

            if (0 < index && index < arr.length - 1) {
                System.out.println("The nearest big number in the array: " + arr[index + 1]);
            } else {
                System.out.println(enteredNumber + " the biggest number in the array");
            }
        }

    }
}