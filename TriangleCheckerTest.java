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
public void testIsoscelesTriangle_version2() {

        // Arrange
        float a = 3;
        float b = 5;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.ISOSCELES, type);

    }
    public void testIsoscelesTriangle_version3() {

        // Arrange
        float a = 5;
        float b = 3;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.ISOSCELES, type);

    }
    @Test //EQUILATERAL
    public void testEquilateralTriangle_1() {

        // Arrange
        float a = 3;
        float b = 4;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.NORMAL, type);

    }

    @Test //EQUILATERAL
    public void testEquilateralTriangle_2() {

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
    public void testValidTriangle_negativeNumbers() {

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
    public void testValidTriangle_sideTooLong_version1() {


        // Arrange
        float a = 2;
        float b = 2;
        float c = 6;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.NONE, type);

    }

    @Test //NONE a+b < c
    public void testValidTriangle_sideTooLong_version2() {

        // Arrange
        float a = 2;
        float b = 6;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.NONE, type);

    }
    @Test //NONE a+b < c
    public void testValidTriangle_sideTooLong_version3() {

        // Arrange
        float a = 6;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals("!!!Type is wrong!!!",TriangleChecker.TriangleType.NONE, type);

    }
}
