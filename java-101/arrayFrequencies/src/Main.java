import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            int count = 1;

            if (!isHas(temp, item)) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                temp[i] = item;
                System.out.println("The number " + item + " was repeated " + count + " times.");
            }


        }

    }

    public static boolean isHas(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item)
                return true;
        }
        return false;
    }
}