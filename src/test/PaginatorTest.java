import org.junit.Test;
import paginator.PaginationHelper;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class PaginatorTest {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(new String[] {"a", "b", "c", "d", "e", "f", "g"}));

    @Test
    public void testItemCount() {
        assertEquals(new PaginationHelper<String>(list, 2).itemCount(), 7);
        // assertEquals("expected", "actual");
    }

    @Test
    public void testPageIndex() {
        assertEquals(new PaginationHelper<String>(list, 5).pageIndex(6), 1);
        // assertEquals("expected", "actual");
    }
}