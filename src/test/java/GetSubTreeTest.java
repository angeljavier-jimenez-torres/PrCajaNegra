import com.bst.BST;
import com.exceptions.DepthException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.bst.Node;

public class GetSubTreeTest {

    // Creamos un objeto de la clase BST para usarlo en las pruebas
    private BST<Integer> bst;

    // Inicializamos el objeto antes de cada prueba
    @BeforeEach
    public void setUp() throws DepthException {
        bst = new BST<>();
        bst.insert(2, true);
        bst.insert(1, true);
        bst.insert(10, true);
        bst.insert(5, true);
        bst.insert(13, true);
        bst.insert(11, true);
        bst.insert(12, true);
    }

    @Test
    public void testGetSubTree0() { // null
        assertThrows(IllegalArgumentException.class, () -> bst.getSubTree(null));
    }

    @Test
    public void testGetSubTreeNoExiste() { // nº no está en el árbol
        Node<Integer> nonExistentNode = new Node<>(999);
        assertThrows(IllegalArgumentException.class, () -> bst.getSubTree(nonExistentNode));
    }

    @Test
    public void testGetSubTreeHoja() { // hoja
        Node<Integer> hoja = bst.search(5);
        assertEquals(1, bst.getSubTree(hoja).size());
        assertEquals(5, bst.getSubTree(hoja).getRoot().getContent());
        System.out.println(bst.getSubTree(hoja).toList());
    }

    @Test
    public void testGetSubTreeIzda() { // solo izda
        Node<Integer> izda = bst.search(13);
        assertEquals(3, bst.getSubTree(izda).size());
        assertEquals(13, bst.getSubTree(izda).getRoot().getContent());
        System.out.println(bst.getSubTree(izda).toList());
    }

    @Test
    public void testGetSubTreeDcha() { // solo dcha
        Node<Integer> dcha = bst.search(11);
        assertEquals(2, bst.getSubTree(dcha).size());
        assertEquals(11, bst.getSubTree(dcha).getRoot().getContent());
        System.out.println(bst.getSubTree(dcha).toList());
    }

    @Test
    public void testGetSubTreeIyD() { // izda y dcha
        Node<Integer> iyd = bst.search(10);
        assertEquals(5, bst.getSubTree(iyd).size());
        assertEquals(10, bst.getSubTree(iyd).getRoot().getContent());
        System.out.println(bst.getSubTree(iyd).toList());
    }

    @Test
    public void testGetSubTreeVarios() { // varios
        Node<Integer> varios = bst.search(2);
        assertEquals(7, bst.getSubTree(varios).size());
        assertEquals(2, bst.getSubTree(varios).getRoot().getContent());
        System.out.println(bst.getSubTree(varios).toList());
    }
}