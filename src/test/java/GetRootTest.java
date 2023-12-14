import static org.junit.jupiter.api.Assertions.*;
import com.exceptions.DepthException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bst.BST;

public class GetRootTest {
    private BST<Integer> bst;

    @BeforeEach
    public void setUp() {
        bst = new BST<>();
    }

    @Test
    public void testGetRootEmptyTree() {
        assertNull(bst.getRoot());
    }

    @Test
    public void testGetRootNonEmptyTree() throws DepthException {
        bst.insert(14, true);
        bst.insert(1, true);
        bst.insert(3, true);
        bst.insert(7, true);
        bst.insert(9, true);
        bst.insert(22, true);
        assertEquals(14, bst.getRoot().getContent());
    }
}