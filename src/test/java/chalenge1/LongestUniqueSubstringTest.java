package chalenge1;

import org.junit.jupiter.api.Test;

import static chalenge1.ErrorOptions.NULL_EXCEPTION_MESSAGE;
import static chalenge1.LongestUniqueSubstring.extractSubstring;
import static org.junit.jupiter.api.Assertions.*;

public class LongestUniqueSubstringTest {
    private static final String SPACE = " ";
    private static final String EMPTY = "";
    private static final String UNIQUE_LETTERS = "abcdef";
    private static final String DUPLCATED_LETTERS = "aaaabcdefffffff";
    private static final String UNIQUE_CHARACTERS = "^%$# abcdef";
    private static final String SPACES = "    ";

    @Test
    public void shouldReturnTheSameIfInputContainsOnlyUniqueCharcters() {
        assertEquals(SPACE, extractSubstring(SPACE));
        assertEquals(EMPTY, extractSubstring(EMPTY));
        assertEquals(UNIQUE_LETTERS, extractSubstring(UNIQUE_LETTERS));
        assertEquals(UNIQUE_CHARACTERS, extractSubstring(UNIQUE_CHARACTERS));
    }

    @Test
    public void shouldFailOnNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> extractSubstring(null));
        assertEquals(NULL_EXCEPTION_MESSAGE.toString(), exception.getMessage());
    }

    @Test
    public void shouldGetOnlyOneCharachterFromDuplicates() {
        assertEquals(UNIQUE_LETTERS, extractSubstring(DUPLCATED_LETTERS));
        assertNotEquals(DUPLCATED_LETTERS, extractSubstring(DUPLCATED_LETTERS));
        assertEquals(SPACE, extractSubstring(SPACES));
        assertNotEquals(SPACES, extractSubstring(SPACES));
    }
}