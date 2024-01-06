package sem_3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunctionsTest {
    @Test
    public void checkEven() {
        assertTrue(Functions.evenOddNumber(2));
    }

    @Test
    public void checkOdd() {
        assertFalse(Functions.evenOddNumber(3));
    }

    @Test
    public void checkInterval() {
        assertTrue(Functions.numberInInterval(27));
    }

    @Test
    public void checkIntervalOut() {
        assertFalse(Functions.numberInInterval(2));
    }
}
