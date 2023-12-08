package org.example;

import com.bst.BST;
import com.exceptions.DepthException;


public class App{
    public static void main(String[] args) throws DepthException {
        BST<Integer> bst = new BST<Integer>(10);
        bst.search(10);
        System.out.println("Insertando 10");
    }
}
