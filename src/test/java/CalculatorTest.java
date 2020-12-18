import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void init(){
        calculator= new Calculator();
    }

    @Test
    @DisplayName("Testing Add Method")
    void addTest(){
        int expected= 2;
        int actual= calculator.add(1, 1);
        assertEquals(expected, actual, "Should return sum");
    }

    @Test
    @DisplayName("Testing Subtract Method")
    void multiplyTest(){
        assertAll(
                ()-> assertEquals(2, calculator.subtract(5,3)),
                ()-> assertEquals(4, calculator.subtract(12, 8)),
                ()-> assertEquals(7, calculator.subtract(21, 14))
        );
    }
}