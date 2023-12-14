import static org.junit.jupiter.api.Assertions.*;

import com.exceptions.DepthException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.bst.BST;

import java.util.LinkedList; //Para imprimir el árbol
import java.util.Queue; //Para imprimir el árbol
import com.bst.Node; //Para imprimir el árbol




public class GetSubTreeTest {
    private BST<Integer> bst;
    private BST<Integer> subTree;

    @BeforeEach
    public void setUp() throws DepthException {
        bst = new BST<>();
        bst.insert(5, true);
        bst.insert(3, true);
        bst.insert(7, true);
        bst.insert(8, true);
        bst.insert(6, true);
        subTree = bst.getSubTree(bst.search(7));
    }

    @Test
    public void testGetSubTreeNullNode() {
        assertNull(bst.getSubTree(null));
    }

    @Test
    public void testGetSubTreeLeafNode() throws DepthException {
        assertEquals(5, subTree.getRoot().getContent());
    }

    @Test
    public void testGetSubTreeNonLeafNode() throws DepthException {
        assertEquals(7, subTree.getRoot().getContent());
    }

    @AfterEach
    public void printAfterTest() {
        System.out.println("BST:");
        printTree(bst.getRoot());
        System.out.println("SubTree:");
        printTree(subTree.getRoot());
        System.out.println();
    }

    //Para imprimir el árbol
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