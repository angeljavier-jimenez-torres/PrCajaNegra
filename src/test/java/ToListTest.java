import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import com.exceptions.DepthException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.bst.BST;

public class ToListTest {
    private BST<Integer> bst;

    @BeforeEach
    public void setUp() {
        bst = new BST<>();
    }

    @Test
    public void testToListEmptyTree() {
        assertTrue(bst.toList().isEmpty());
    }

    @Test
    public void testToListSingleElementTree() throws DepthException {
        bst.insert(5, true);
        assertEquals(5, bst.toList().get(0));
    }

    @Test
    public void testToListMultipleElementsTree() throws DepthException {
        bst.insert(5, true);
        bst.insert(3, true);
        bst.insert(7, true);
        bst.insert(6, true);
        bst.insert(8, true);
        bst.insert(10, true);
        bst.insert(11, true);
        bst.insert(12, true);
        bst.insert(13, true);
        bst.insert(14, true);
        bst.insert(15, true);
        bst.insert(16, true);
        bst.insert(18, true);
        bst.insert(17, true);
        bst.insert(24, true);
        bst.insert(21, true);
        bst.insert(33, true);
        bst.insert(20, true);
        bst.insert(59, true);
        bst.insert(29, true);
        assertEquals(3, bst.toList().get(0));
        assertEquals(5, bst.toList().get(1));
        assertEquals(6, bst.toList().get(2));
        assertEquals(7, bst.toList().get(3));
        assertEquals(8, bst.toList().get(4));
    }

    @AfterEach
    public void printAfterTest() {
        System.out.println(bst.toList());
    }

}