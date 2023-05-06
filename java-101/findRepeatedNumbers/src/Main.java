import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 0, 122, 2, 9, 10, 21, 1, 33, 9, 1, 4, 4, 4, 122, 122};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j] && list[i] % 2 == 0) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int i : duplicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}