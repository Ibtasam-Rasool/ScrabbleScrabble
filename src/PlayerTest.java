import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PlayerTest {

    Player p, p2, p3;

    @Before
    public void setUp() throws Exception {
        p = new Player("Weird Al");
        p2 = new Player("P2");
        p3 = new Player("James");
    }

    @Test
    public void testConstructorInitialScoreZero() {
        assertTrue(p.getScore() == 0);
    }


    @Test
    public void testConstructorInitialNameIsCorrect() { // should update test after GUI (break from player input?)
        assertTrue(p.toString().equals("Weird Al"));
    }


    @Test
    public void testConstructorInitialTrayIsSetUp() { assertTrue(p.stringTray() != null));

    }


    @Test
    public void testCanUpdateScoreByPositiveNumber() {
        assertTrue(p.getScore() == 0);
        p.updateScore(25);
        assertTrue(p.getScore() == 25);
        p.updateScore(1);
        assertTrue(p.getScore() == 26);
        p.updateScore(7);
        assertTrue(p.getScore() == 33);
    }


    @Test
    public void testCannotUpdateScoreByNegativeNumber() { // Actual fail --> need to update logic
        assertTrue(p.getScore() == 0);
        p.updateScore(-4);
        assertFalse(p.getScore() >= 0);
    }
    

    @Test
    public void testCheckInTrayTrueForListInTray() {
        assertFalse(true);
    }


    @Test
    public void testCheckInTrayFalseForListNotInTray() {
        assertFalse(true);
    }


    @Test
    public void testRemoveLettersRemovesALetter() {


    }


    @Test
    public void testRemoveLettersDoesNotRemoveALetterNotInTray() {
        assertFalse(true);
    }


    @Test
    public void testTestRemoveLettersRemoves4Letters() {
        assertFalse(true);
    }


    @Test
    public void testRemoveLettersRemovesAllLetters() {
        assertFalse(true);
    }


    @Test
    public void testSwapLettersSwapsALetter() {
        assertFalse(true);
    }


    @Test
    public void testSwapLettersDoesNotSwapLettersNotInTray() {
        assertFalse(true);
    }


    @Test
    public void testSwapLettersSwapMultipleLetters() {
        assertFalse(true);
    }


    @Test
    public void testSwapLettersCanSwapAllLetters() {


        assertFalse(true);
    }

}