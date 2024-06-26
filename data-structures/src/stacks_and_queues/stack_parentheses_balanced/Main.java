package stacks_and_queues.stack_parentheses_balanced;

public class Main {

    public static boolean isBalancedParentheses(String string) {
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(') leftStack.push(c);
            if (c == ')') rightStack.push(c);
        }

        if (leftStack.size() != rightStack.size()) return false;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(') rightStack.pop();
            if (c == ')') leftStack.pop();
            if (rightStack.size() > leftStack.size()) return false;
        }

        return leftStack.isEmpty() && rightStack.isEmpty();
    }


    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

}
