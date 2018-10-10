import static org.junit.Assert.*;

import helpBookseller.HelpBook;
import org.junit.Test;

public class Testing {

    public static void main(String[] args) {

    }

    @Test
    public void testHelpBook() {
        HelpBook hlpBook = new HelpBook();
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        assertEquals("(A : 200) - (B : 1140)",
                hlpBook.bookCounter(art, cd));
    }
}
