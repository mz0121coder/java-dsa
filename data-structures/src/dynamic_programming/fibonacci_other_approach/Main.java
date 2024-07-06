package dynamic_programming.fibonacci_other_approach;

/*
First run:
O(n - 1) -> O(n)
Following runs:
O(n - 1) -> O(n)
 */
public class Main {
    static int counter = 0;

    public static int fib(int n) {
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;

        for (int index = 2; index <= n; index++) {
            counter++;
            fibList[index] = fibList[index - 1] + fibList[index - 2];
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n = 500;
        System.out.println("\nFib of " + n + " = " + fib(n));
        System.out.println("\nCounter: " + counter);
    }
}
