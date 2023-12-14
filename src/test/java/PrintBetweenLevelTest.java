import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;

import com.bst.BST;

public class PrintBetweenLevelTest {

    private BST<Integer> bst;

    @BeforeEach
    public void setUp() throws DepthException{
        bst = new BST<>();
        for (int i = 0; i < 50; i++) {
            bst.insert(i, true);
        }
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource(value= {
            "0,0", "0,1", "0,2",          "0,25",            "0,49", "0,50", "0,51",
            "1,0",                                                            "1,51",
            "2,0",                                                            "2,51",

            "25,0",                                                           "25,51",

            "49,0",                                                           "49,51",
            "50,0",                                                            "50,51",
            "51,0", "51,1", "51,2",       "51,25",           "51,49", "51,50", "51,51"
    })
    public void testPrintBetweenLevelFueraDeRango(int a , int b) {
        assertThrows(BetweenLevelException.class, () -> bst.printBetweenLevel(a, b));
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource(value= {
            "2,1",
            "25,1", "25,2",
            "49,1", "49,2",       "49,25",
            "50,1", "50,2",       "50,25",           "50,49"
    })
    public void testPrintBetweenLevelAmayorB(int a , int b) {
        assertThrows(BetweenLevelException.class, () -> bst.printBetweenLevel(a, b));
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource(value= {
            "1,1", "1,2",          "1,25",            "1,49", "1,50",
            "2,2",                 "2,25",            "2,49", "2,50",
                                   "25,25",           "25,49", "25,50",
                                                      "49,49", "49,50",
                                                               "50,50"
    })
    public void testPrintBetweenLevelValidos(int a , int b) throws BetweenLevelException {
            System.out.println(bst.printBetweenLevel(a, b));
    }

}