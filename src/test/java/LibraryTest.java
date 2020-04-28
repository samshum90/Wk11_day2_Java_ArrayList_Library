import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void before(){
        book1 = new Book( "Harry Potter", "J K Rowling", "Fiction");
        book2 = new Book( "Five Foxes in the Forest", "Matt Handy", "Horror");
        library = new Library( "Central", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Central", library.getName());
    }
    @Test
    public void canGetCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canGetStockSize() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void addBookToStock() {
        library.add(book1);
        library.add(book2);
        library.add(book2);
        assertEquals( 2, library.stockCount());
    }
    @Test
    public void removeBookToStock() {
        library.add(book1);
        library.remove(book1);
        assertEquals( 0, library.stockCount());
    }
}
