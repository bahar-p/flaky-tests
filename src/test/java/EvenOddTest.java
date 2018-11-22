import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddTest {

    @Test
    public void even_odd() {
        EvenOdd evenOdd = new EvenOdd();
        String result = evenOdd.even_odd(1,4);
        assertEquals("Even", result);
    }

}