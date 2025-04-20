import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    void testEquilateralTriangle() {
        assertEquals("tam giác đều", TriangleClassifier.classify(2, 2, 2));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("tam giác cân", TriangleClassifier.classify(2, 2, 3));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("tam giác thường", TriangleClassifier.classify(3, 4, 5));
    }

    @Test
    void testNotATriangle1() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(8, 2, 3));
    }

    @Test
    void testNotATriangle2() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(-1, 2, 1));
    }

    @Test
    void testNotATriangle3() {
        assertEquals("không phải là tam giác", TriangleClassifier.classify(0, 1, 1));
    }
}
