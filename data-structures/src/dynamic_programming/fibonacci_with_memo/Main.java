package dynamic_programming.fibonacci_with_memo;

/*
First run:
O(2n - 1) -> O(n)
Following runs:
O(1)
 */
public class Main {
    static Integer[] memo = new Integer[1000];
    static int counter = 0;

    public static int fib(int n) {
        counter++;

        if (memo[n] != null) {
            return memo[n];
        }
        if (n == 0 || n == 1) {
            return n;
        }
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 500;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nCounter: " + counter);
    }
}
