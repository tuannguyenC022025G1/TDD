import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberReaderTest {

    @Test
    void testSingleDigit() {
        assertEquals("năm", NumberReader.convertToWords(5));
    }

    @Test
    void testRoundTen() {
        assertEquals("sáu mươi", NumberReader.convertToWords(60));
    }

    @Test
    void testTwoDigit() {
        assertEquals("hai mươi ba", NumberReader.convertToWords(23));
    }

    @Test
    void testLowerBound() {
        assertEquals("không", NumberReader.convertToWords(0));
    }

    @Test
    void testOutOfRangeLow() {
        assertThrows(IllegalArgumentException.class, () -> NumberReader.convertToWords(-1));
    }

    @Test
    void testOutOfRangeHigh() {
        assertThrows(IllegalArgumentException.class, () -> NumberReader.convertToWords(100));
    }
}
