import static org.junit.jupiter.api.Assertions.*;
import com.exceptions.DepthException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bst.BST;

public class SearchTest {
    private BST<Integer> bst;

    @BeforeEach
    void setUp() throws DepthException {
        bst = new BST<>();
        // Insertamos algunos valores para las pruebas
        bst.insert(-2500, true);
        bst.insert(-2499, true);
        bst.insert(2499, true);
    }

    @Test
    void testSearchAtLowerBoundary() {
        assertEquals(-2500, bst.search(-2500).getContent());
    }

    @Test
    void testSearchJustInsideLowerBoundary() {
        assertEquals(-2499, bst.search(-2499).getContent());
    }

    @Test
    void testSearchJustOutsideLowerBoundary() {
        assertNull(bst.search(-2501));
    }

    @Test
    void testSearchAtUpperBoundary() {
        assertNull(bst.search(2500));
    }

    @Test
    void testSearchJustInsideUpperBoundary() {
        assertEquals(2499, bst.search(2499).getContent());
    }

    @Test
    void testSearchJustOutsideUpperBoundary() {
        assertNull(bst.search(2501));
    }

    @Test
    void testSearchNonExistentValue() {
        assertNull(bst.search(0));
    }
}