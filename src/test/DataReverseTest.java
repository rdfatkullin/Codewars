import java.io.IOException;
import java.util.*;

import dataReverse.DataReverse;
import dataReverse.DataReverseStream;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class DataReverseTest {

    @Test
    public void Test1() {
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        int[] data2= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        assertArrayEquals(data2, DataReverse.DataReversed(data1));
    }

    @Test
    public void Test2() {
        int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
        int[] data2= {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
        assertArrayEquals(data2, DataReverse.DataReversed(data1));

    }

    @Test
    public void Test3() {
        int[] data1= {0,0,0,0,0,0,0,0, 0,1,1,1,1,1,1,0, 1,1,1,1,1,0,1,0, 1,1,0,0,1,1,0,0, 1,0,1,0,0,1,1,0, 1,1,0,1,1,1,0,1};
        int[] data2= {1,1,0,1,1,1,0,1, 1,0,1,0,0,1,1,0, 1,1,0,0,1,1,0,0, 1,1,1,1,1,0,1,0, 0,1,1,1,1,1,1,0, 0,0,0,0,0,0,0,0};
        assertArrayEquals(data2, DataReverse.DataReversed(data1));

    }

    @Test
    public void Test4() {
        int[] data1= {0,1,1,0,1,1,0,1};
        int[] data2= {0,1,1,0,1,1,0,1};
        assertArrayEquals(data2, DataReverse.DataReversed(data1));
    }

    @Test
    public void TestThatFailsInRandomTest() {
        int[] data1= {0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1};
        int[] data2= {0,1,0,1,1,1,1,1,0,1,1,1,0,0,0,0};
        assertArrayEquals(data2, DataReverse.DataReversed(data1));
    }
}