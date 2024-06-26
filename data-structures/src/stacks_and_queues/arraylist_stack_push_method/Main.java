package stacks_and_queues.arraylist_stack_push_method;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStack.printStack();

        /*
            EXPECTED OUTPUT:
			3
			2
			1

        */

    }

}