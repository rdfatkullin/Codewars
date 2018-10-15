import static org.junit.Assert.*;
import java.util.Random;

import org.junit.Test;
import zeroOrInf.ZeroOrInf;


public class ZeroOrInfTest {

    private static final double DELTA = 1e-10;

    @Test
    public void test1() {
        assertEquals(1.275, ZeroOrInf.going(5), DELTA);
    }
    @Test
    public void test2() {
        assertEquals(1.2125, ZeroOrInf.going(6), DELTA);
    }
    @Test
    public void test3() {
        assertEquals(1.173214, ZeroOrInf.going(7), DELTA);
    }

    @Test
    public void test4() {
        assertEquals(1.173214, ZeroOrInf.going(524), DELTA);
    }

}