import javabuzz.java.JavaBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaBuzzTest {
    JavaBuzz javabuzz;

    @Before public void setUp(){
        javabuzz = new JavaBuzz();
    }

    @Test
    public void isDivisibleByThree(){
        assertTrue(javabuzz.isDivisibleByThree(3));
    }

    @Test
    public void isNotDivisibleByThree(){
        assertFalse(javabuzz.isDivisibleByThree(1));
    }

    @Test
    public void isDivisibleByFive(){
        assertTrue(javabuzz.isDivisibleByFive(5));
    }

    @Test
    public void isNotDivisibleByFive(){
        assertFalse(javabuzz.isDivisibleByFive(1));
    }

    @Test
    public void isDivisibleByFifteen(){
        assertTrue(javabuzz.isDivisibleByFifteen(15));
    }

    @Test
    public void isNotDivisibleByFifteen(){
        assertFalse(javabuzz.isDivisibleByFifteen(1));
    }

    @Test
    public void sayJava(){
        assertEquals("Java", javabuzz.says(3));
    }

    @Test
    public void sayBuzz(){
        assertEquals("Buzz", javabuzz.says(5));
    }

    @Test
    public void sayJavaBuzz(){
        assertEquals("JavaBuzz", javabuzz.says(15));
    }

    @Test
    public void sayNumber(){
        assertEquals("1", javabuzz.says(1));
    }
}