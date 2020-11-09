import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test //NORMAL
    public void testNormalTriangle() {

        // Arrange
        float a = 3;
        float b = 4;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.NORMAL, type);

    }

    @Test //ISOSCELES
    public void testIsoscelesTriangle() {

        // Arrange
        float a = 3;
        float b = 3;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.ISOSCELES, type);

    }

    @Test //EQUILATERAL
    public void testEquilateralTriangle() {

        // Arrange
        float a = 3;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.EQUILATERAL, type);

    }

    @Test //NONE
    public void testValidTriangle() {

        // Arrange
        float a = -2;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.NONE, type);

    }

    @Test //NONE a+b < c
    public void testValidTriangle2() {

        // Arrange
        float a = 2;
        float b = 2;
        float c = 6;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.NONE, type);

    }
}
