import org.junit.Test;
import wrNumberExpanded.NumberExpanded;

import static org.junit.Assert.assertEquals;

public class NumberExpandedTest {

    @Test
    public void testSomething() {
        assertEquals("10 + 2", NumberExpanded.expandedForm(12));
        assertEquals("40 + 2", NumberExpanded.expandedForm(42));
        assertEquals("70000 + 300 + 4", NumberExpanded.expandedForm(70304));
    }

}
