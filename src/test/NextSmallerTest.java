//import nextSmaller.NextSmaller;
import nextSmaller.NextSmallerPermutation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NextSmallerTest {
    @Test
    public void basicTests() {
        assertEquals(12, NextSmallerPermutation.nextSmaller(21));
        assertEquals(790, NextSmallerPermutation.nextSmaller(907));
        assertEquals(513, NextSmallerPermutation.nextSmaller(531));
        assertEquals(-1, NextSmallerPermutation.nextSmaller(1027));
        assertEquals(-1, NextSmallerPermutation.nextSmaller(127));
        assertEquals(414, NextSmallerPermutation.nextSmaller(441));
        assertEquals(123456789, NextSmallerPermutation.nextSmaller(123456798));
        assertEquals(190000000, NextSmallerPermutation.nextSmaller(900000001));
        NextSmallerPermutation.nextSmaller(202233445566L);
    }
}