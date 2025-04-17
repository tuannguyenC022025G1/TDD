import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {

    @Test
    void testNextDay_01012018() {
        assertEquals("2/1/2018", NextDayCalculator.findNextDay(1, 1, 2018));
    }

    @Test
    void testNextDay_31012018() {
        assertEquals("1/2/2018", NextDayCalculator.findNextDay(31, 1, 2018));
    }

    @Test
    void testNextDay_30042018() {
        assertEquals("1/5/2018", NextDayCalculator.findNextDay(30, 4, 2018));
    }

    @Test
    void testNextDay_28022018() {
        assertEquals("1/3/2018", NextDayCalculator.findNextDay(28, 2, 2018));
    }

    @Test
    void testNextDay_29022020() {
        assertEquals("1/3/2020", NextDayCalculator.findNextDay(29, 2, 2020));
    }

    @Test
    void testNextDay_31122018() {
        assertEquals("1/1/2019", NextDayCalculator.findNextDay(31, 12, 2018));
    }
}
