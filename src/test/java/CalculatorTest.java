import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void calculate() {
        Calculator c = new Calculator();
        c.first = 0.1;
        c.second  =10.9;
        double actual = c.calculate('+');
        double expected = 11;
        assertEquals(actual, expected);
    }

    @Test
    public void calculate1() {
        Calculator c = new Calculator();
        c.first = -0.1;
        c.second  =-10.9;
        double actual = c.calculate('+');
        double expected = -11;
        assertEquals(actual, expected);
    }
    @Test
    public void calculate2() {
        Calculator c = new Calculator();
        c.first = 0.1;
        c.second  =-10.9;
        double actual = c.calculate('+');
        double expected = -10.8;
        assertEquals(actual, expected);
    }
    @Test
    public void calculate3() {
        Calculator c = new Calculator();
        c.first = 0.1;
        c.second  =10.9;
        double actual = c.calculate('-');
        double expected = -10.8;
        assertEquals(actual, expected);
    }

    @Test
    public void calculate4() {
        Calculator c = new Calculator();
        c.first = -0.1;
        c.second  =-10.9;
        double actual = c.calculate('-');
        double expected = 10.8;
        assertEquals(actual, expected);
    }
    @Test
    public void calculate5() {
        Calculator c = new Calculator();
        c.first = 0.1;
        c.second  =-10.9;
        double actual = c.calculate('-');
        double expected = 11;
        assertEquals(actual, expected);
    }
    @Test
    public void calculate6() {
        Calculator c = new Calculator();
        c.first = 2.0;
        c.second  =10.0;
        double actual = c.calculate('*');
        double expected = 20.0;
        assertEquals(actual, expected);
    }

    @Test
    public void calculate7() {
        Calculator c = new Calculator();
        c.first = 2.0;
        c.second  =-10.0;
        double actual = c.calculate('*');
        double expected = -20.0;
        assertEquals(actual, expected);
    }
    @Test
    public void calculate8() {
        Calculator c = new Calculator();
        c.first = -2.0;
        c.second  =-10.0;
        double actual = c.calculate('*');
        double expected = 20.0;
        assertEquals(actual, expected);
    }
    @Test
    public void calculate9() {
        Calculator c = new Calculator();
        c.first = 10.0;
        c.second  =2.0;
        double actual = c.calculate('/');
        double expected = 5.0;
        assertEquals(actual, expected);
    }

    @Test
    public void calculate10() {
        Calculator c = new Calculator();
        c.first = 10.0;
        c.second  =-2.0;
        double actual = c.calculate('/');
        double expected = -5.0;
        assertEquals(actual, expected);
    }
    @Test
    public void calculate11() {
        Calculator c = new Calculator();
        c.first = -10.0;
        c.second  =-2.0;
        double actual = c.calculate('/');
        double expected = 5.0;
        assertEquals(actual, expected);
    }

}