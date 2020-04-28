import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
        public void before() {
            book = new Book( "Harry Potter", "J K Rowling", "Fiction");
    }

    @Test
    public void canGetName(){
        assertEquals("Harry Potter", book.getName());
    }
    @Test
    public void canGetAuthor(){
        assertEquals("J K Rowling", book.getAuthor());
    }
    @Test
    public void canGetGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
