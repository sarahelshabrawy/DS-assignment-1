import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator calctest = new Calculator();
    @Test
    void add() {
        assertEquals(5,calctest.add(2,3),"Error in adding");
        assertEquals(0,calctest.add(-1,1),"Error in adding");
    }


    @Test
    void divide() {
        assertEquals(8,calctest.divide(16,2),"Error in division");
        assertEquals(2.5,calctest.divide(5,2),"Error in division");
        assertEquals(0.33333333333333,calctest.divide(1,3),0.00000001);
        //division by zero
        Exception exception = assertThrows(RuntimeException.class, () -> calctest.divide(1, 0));
        assertEquals("Can't divide by zero!", exception.getMessage());
    }
}