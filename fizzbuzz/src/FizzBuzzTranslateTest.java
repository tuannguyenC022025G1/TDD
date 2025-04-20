import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {

    @Test
    void testFizzDivisibleBy3() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(9));
    }

    @Test
    void testBuzzDivisibleBy5() {
        assertEquals("Buzz", FizzBuzzTranslate.translate(10));
    }

    @Test
    void testFizzBuzzDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
    }

    @Test
    void testFizzContains3() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
    }

    @Test
    void testBuzzContains5() {
        assertEquals("Buzz", FizzBuzzTranslate.translate(52));
    }

    @Test
    void testFizzBuzzContains3And5() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(53));
    }

    @Test
    void testNumberNotFizzBuzz() {
        assertEquals("2", FizzBuzzTranslate.translate(2));
    }
}
