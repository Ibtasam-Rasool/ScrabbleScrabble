import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

/**
 * A test class for the Tray class.
 */
public class TrayTest {

    Tray t;

    @Before
    public void setUp() throws Exception {
        t = new Tray();
    }


    @Test
    public void testTrayConstructor() {
        assertNotNull(t);
        assertEquals(Tray.SIZE,t.getLetters().size());
    }


    @Test
    public void testRemoveLetterRemoves1LetterAtATimeUntilEmpty() {
        String letters = "";
        Tray testTray = t;
        for(String letter : testTray.getLetters()){
            letters += letter;
        }
        int expectedSize = Tray.SIZE;
        for(int i = 0; i < letters.length(); i ++) {
            t.removeLetter("" + letters.charAt(i));
            expectedSize--;
            assertEquals(expectedSize, t.getLetters().size());
        }
    }


    @Test
    public void testRemoveLetter() {
        Tray testTray = t;
        String letter = t.getLetters().get(0);
        int freq = t.checkInTrayFrequency(letter);

        t.removeLetter(letter);
        assertTrue(t.checkInTrayFrequency(letter) < freq);
    }


    @Test
    public void testRemoveBlank() {
        Tray testTray = new Tray("A B C __ D E F");
        String blank = "__";
        assertEquals(1, testTray.checkInTrayFrequency(blank));
        System.out.println("before: " + testTray);

        t.removeLetter(blank);
        System.out.println("after: " + testTray);

        assertEquals(0, testTray.checkInTrayFrequency(blank));
    }


    @Test
    public void testReturnLetterToBag() {
        Tray testTray = t;
        String letter = t.getLetters().get(0);
        int bagFreq = t.getLetterBag().letterQuantity(letter);

        t.returnLetterToBag(letter);
        assertTrue(t.getLetterBag().letterQuantity(letter) > bagFreq);
    }

    @Test
    public void testFillFillsAnEmptyTray() {
        String letters = "";
        Tray testTray = t;
        for(String letter : testTray.getLetters()){
            letters += letter;
        }
        for(int i = 0; i < letters.length(); i ++) {
            t.removeLetter("" + letters.charAt(i));
        }
        System.out.println("line 74:  " + t.getLetters());
        assertEquals(0,t.getLetters().size());
        t.fill();
        assertEquals(Tray.SIZE,t.getLetters().size());
    }
}