import static org.junit.Assert.*;
import org.junit.*;

public class LetterBagTest {

    private LetterBag bag;

    @Before
    public void setUp() throws Exception {

        bag = new LetterBag();
        if (bag == null) throw new Exception("Uninitialized LetterBag");


    }

    //Deliverable 3
//    @Test
//    public void lettersLeft() {
//
//    }

    //Deliverable 2
    @Test
    public void initialLettersLeft(){
        assertEquals(26,bag.lettersLeft());
    }


    @Test
    public void LetterQuantity(){
        assertEquals(9, bag.letterQuantity("A"));
    }

    @Test
    public void drawRandomLetter(){
        LetterBag bag2 = new LetterBag();
        String s = bag.drawRandomLetter();

        assertNotEquals(bag.letterQuantity(s),bag2.letterQuantity(s));
    }

    @Test
    public void increaseLetterQuantity(){
        bag.increaseLetterQuantity("A");
        assertEquals(10, bag.letterQuantity("A"));
    }

    @Test
    public void decreaseLetterQuantity(){
        bag.decreaseLetterQuantity("A");
        assertEquals(10, bag.letterQuantity("A"));
    }

    @Test
    public void removeLetter(){
        assertEquals(10, bag.letterQuantity("A"));
    }
}