import static org.junit.jupiter.api.Assertions.*;
import com.exceptions.DepthException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bst.BST;

public class InsertTest {
    private BST<Integer> bst;

    @BeforeEach
    void setUp() {
        bst = new BST<>();
    }

    @Test
    void testInsertAtLowerBoundary() throws DepthException {
        bst.insert(-2500, true);
        assertEquals(1, bst.size());
        assertEquals(-2500, bst.getRoot().getContent());
    }

    @Test
    void testInsertJustInsideLowerBoundary() throws DepthException {
        bst.insert(-2499, true);
        assertEquals(1, bst.size());
        assertEquals(-2499, bst.getRoot().getContent());
    }

    @Test
    void testInsertJustOutsideLowerBoundary() {
        assertThrows(IllegalArgumentException.class, () -> bst.insert(-2501, true));
    }

    @Test
    void testInsertAtUpperBoundary() {
        assertThrows(IllegalArgumentException.class, () -> bst.insert(2500, true));
    }

    @Test
    void testInsertJustInsideUpperBoundary() throws DepthException {
        bst.insert(2499, true);
        assertEquals(1, bst.size());
        assertEquals(2499, bst.getRoot().getContent());
    }

    @Test
    void testInsertJustOutsideUpperBoundary() {
        assertThrows(IllegalArgumentException.class, () -> bst.insert(2501, true));
    }

    @Test
    void testInsertExceedingMaxDepth() {
        for (int i = 0; i < 50; i++) {
            try {
                bst.insert(i, true);
            } catch (DepthException e) {
                fail("DepthException thrown too early");
            }
        }
        assertThrows(DepthException.class, () -> bst.insert(50, true));
    }
}