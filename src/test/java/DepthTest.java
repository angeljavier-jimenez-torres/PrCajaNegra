import static org.junit.jupiter.api.Assertions.*;

import com.bst.Node;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bst.BST;
import com.exceptions.DepthException;

import java.util.LinkedList;
import java.util.Queue;

public class DepthTest {
    private BST<Integer> bst;
    /*Create a @BeforeEach*/
    @BeforeEach
    void setUp() {
        bst = new BST<>();
    }



    @Test
    public void testDepthEmptyTree() throws DepthException{
        assertEquals(0, bst.depth());
    }

    @Test
    public void testDepthSingleTreeNode() throws DepthException {
        bst.insert(5, true); // Inserting a single node
        assertEquals(1, bst.depth());
    }

    @Test
    public void testDepthMultipleTreeNodes() throws DepthException {
        bst.insert(60, true);
        bst.insert(1, true);
        //bst.insert(2, true);
        bst.insert(3, true);
        bst.insert(4, true);
        bst.insert(5, true);
        bst.insert(6, true);
        bst.insert(7, true);
        bst.insert(8, true);
        bst.insert(9, true);
        bst.insert(10, true);
        bst.insert(11, true);
        bst.insert(12, true);
        bst.insert(13, true);
        bst.insert(14, true);
        bst.insert(15, true);
        bst.insert(16, true);
        bst.insert(17, true);
        bst.insert(18, true);
        bst.insert(19, true);
        bst.insert(20, true);
        bst.insert(21, true);
        bst.insert(22, true);
        bst.insert(23, true);
        bst.insert(24, true);
        bst.insert(25, true);
        bst.insert(26, true);
        bst.insert(27, true);
        bst.insert(28, true);
        bst.insert(29, true);
        bst.insert(30, true);
        bst.insert(31, true);
        bst.insert(32, true);
        bst.insert(33, true);
        bst.insert(34, true);
        bst.insert(35, true);
        bst.insert(36, true);
        bst.insert(37, true);
        bst.insert(38, true);
        bst.insert(39, true);
        bst.insert(40, true);
        bst.insert(41, true);
        bst.insert(42, true);
        bst.insert(43, true);
        bst.insert(44, true);
        bst.insert(45, true);
        bst.insert(46, true);
        bst.insert(470, true);
        bst.insert(53, true);
        bst.insert(54, true);
        bst.insert(48, true);
        bst.insert(47, true);
        bst.insert(49, true);
        assertEquals(49, bst.depth());
    }

    @AfterEach
    public void printAfterTest() {
        printTree(bst.getRoot());
        System.out.println("\nDepth of tree: " + bst.depth());
        System.out.println();
    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;

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
    } //Para imprimir el árbol


}