public class Main {
    public static void main(String[] args) {
            System.out.print(findFibonacci(6));
    }

    static int findFibonacci(int n) {
        if (n == 0 || n == 1) return n;
        else
            return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}