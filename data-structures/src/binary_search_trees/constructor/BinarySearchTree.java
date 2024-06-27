package binary_search_trees.constructor;

public class BinarySearchTree {
    private Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }


    public Node getRoot() {
        return root;
    }

}