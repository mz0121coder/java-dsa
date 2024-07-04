package tree_traversal.dfs_preorder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    /*
    Approach 1 - using an inner class for traversal
     */

//        public ArrayList<Integer> DFSPreOrder() {
//        ArrayList<Integer> results = new ArrayList<>();
//        class Traverse {
//            Traverse(Node currentNode) {
//                results.add(currentNode.value);
//                if (currentNode.left != null) {
//                    new Traverse(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    new Traverse(currentNode.right);
//                }
//            }
//        }
//        new Traverse(root);
//        return results;
//    }

    /*
    Approach 2 (which I like more) - using a helper method that calls itself recursively, using the left and right nodes from the starting point
     */

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        DFSPreOrderHelper(root, results);
        return results;
    }

    private void DFSPreOrderHelper(Node currentNode, ArrayList<Integer> results) {
        results.add(currentNode.value);
        if (currentNode.left != null) DFSPreOrderHelper(currentNode.left, results);
        if (currentNode.right != null) DFSPreOrderHelper(currentNode.right, results);
    }
}