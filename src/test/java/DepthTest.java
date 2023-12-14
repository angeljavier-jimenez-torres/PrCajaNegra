import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bst.BST;
import com.exceptions.DepthException;

public class DepthTest {
    private BST<Integer> tree;
    /*Create a @BeforeEach*/
    @BeforeEach
    void setUp() {
        tree = new BST<>();
    }



    @Test
    public void testDepthEmptyTree() throws DepthException{
        assertEquals(0, tree.depth());
    }

    @Test
    public void testDepthSingleTreeNode() throws DepthException {
        tree.insert(5, true); // Inserting a single node
        assertEquals(1, tree.depth());
    }

    @Test
    public void testDepthMultipleTreeNodes() throws DepthException {
        tree.insert(5, true);
        tree.insert(3, true);
        tree.insert(7, true); // Inserting multiple nodes
        assertTrue(tree.depth() > 1);
    }


}