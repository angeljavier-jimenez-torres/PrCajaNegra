package org.example;


import java.util.LinkedList;
import java.util.Queue;

import com.bst.BST;
import com.bst.Node;
import com.exceptions.DepthException;

public class App {
    public static void main(String[] args) throws DepthException{
        BST<Integer> bst = new BST<>();
        bst.insert(5, false);
        bst.insert(3, false);
        bst.insert(7, true);
        bst.insert(1, true);
        bst.insert(4, true);
        bst.insert(6,  true);
        bst.insert(8, true);

        System.out.println(bst.getSubTree(bst.search(7)).toList());




        //printTree(bst.getRoot());
        //System.out.println("\nDepth of tree: " + bst.depth());
    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.print("Level " + level + ": ");
            for (int i = 0; i < size; i++) {
                Node current = queue.remove();
                System.out.print(current.getContent() + " ");

                if (current.getLeftChild() != null) {
                    queue.add(current.getLeftChild());
                }

                if (current.getRightChild() != null) {
                    queue.add(current.getRightChild());
                }
            }
            System.out.println();
            level++;
        }
    }
}