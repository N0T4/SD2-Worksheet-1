package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WordTest {

    @Test
    public void testContains() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});

        assertTrue(word.contains('h'));  // Should be true
        assertTrue(word.contains('o'));  // Should be true
        assertFalse(word.contains('z')); // Should be false
    }

    @Test
    public void testLength() {
        Word word1 = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        Word word2 = new Word(new char[]{'a', 'b'});
        Word word3 = new Word(new char[]{});

        assertEquals(5, word1.length());
        assertEquals(2, word2.length());
        assertEquals(0, word3.length());
    }

    @Test
    public void testNotNull() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertNotNull(word.getLetters());
    }
}
