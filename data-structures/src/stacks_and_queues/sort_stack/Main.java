package stacks_and_queues.sort_stack;

public class Main {

    public static void sortStack(Stack<Integer> stack1) {
        Stack<Integer> stack2 = new Stack<>();
        while (!stack1.isEmpty()) {
            int temp = stack1.pop();
            while (!stack2.isEmpty() && stack2.peek() > temp) {
                stack1.push(stack2.pop());
            }
            stack2.push(temp);
        }
        stack2.printStack();
        while (!stack2.isEmpty()) stack1.push(stack2.pop());
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            2
            4
            1
            3

            After sorting:
            1
            2
            3
            4
        */

    }

}

