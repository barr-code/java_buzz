import javabuzz.java.JavaBuzz;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaBuzzTest {
    @Test
    public void isDivisibleByThree(){
        JavaBuzz javabuzz = new JavaBuzz();
        assertTrue(javabuzz.isDivisibleByThree(3));
    }

    @Test
    public void isNotDivisibleByThree(){
        JavaBuzz javabuzz = new JavaBuzz();
        assertFalse(javabuzz.isDivisibleByThree(1));
    }

    @Test
    public void isDivisibleByFive(){
        JavaBuzz javabuzz = new JavaBuzz();
        assertTrue(javabuzz.isDivisibleByFive(5));
    }

    @Test
    public void isNotDivisibleByFive(){
        JavaBuzz javabuzz = new JavaBuzz();
        assertFalse(javabuzz.isDivisibleByFive(1));
    }
}