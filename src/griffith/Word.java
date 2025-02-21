package griffith;

public class Word {
    private char[] letters;

    // Constructor ensuring the array is never null
    public Word(char[] letters) {
        this.letters = (letters != null) ? letters : new char[0]; // Avoids null issues
    }

    // Check if the character exists in the word
    public boolean contains(char symbol) {
        for (char letter : letters) {
            if (letter == symbol) {
                return true;
            }
        }
        return false;
    }

    // Return the length of the word
    public int length() {
        return letters.length;
    }

    // Return the character array
    public char[] getLetters() {
        return letters;
    }
}

