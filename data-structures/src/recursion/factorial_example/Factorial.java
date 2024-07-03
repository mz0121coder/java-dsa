package recursion.factorial_example;

public class Factorial {
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int myFactorial = factorial(8);
        System.out.println(myFactorial);
    }
}
