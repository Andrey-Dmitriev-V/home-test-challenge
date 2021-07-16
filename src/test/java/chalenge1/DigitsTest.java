package chalenge1;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static chalenge1.Digits.mostFrequentDigit;
import static chalenge1.ErrorOptions.NULL_EXCEPTION_MESSAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitsTest {
    private static final List<Integer> ONE = List.of(1);
    private static final Map.Entry<Integer,Integer> ONE_RESULT = Map.of(1,1).entrySet().iterator().next();
    private static final List<Integer> SEVERAL_NUMBERS = List.of(22,3,53,883);
    private static final Map.Entry<Integer,Integer> SEVERAL_NUMBERS_RESULT = Map.of(3,3).entrySet().iterator().next();

    @Test
    public void shouldFailOnNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> mostFrequentDigit(null));
        assertEquals(NULL_EXCEPTION_MESSAGE.toString(), exception.getMessage());
    }

    @Test
    void shouldFindForOneDigit() {
        assertEquals(ONE_RESULT,mostFrequentDigit(ONE));
    }

    @Test
    void shouldFindForSeveralNumbers() {
        assertEquals(SEVERAL_NUMBERS_RESULT,mostFrequentDigit(SEVERAL_NUMBERS));
    }

}