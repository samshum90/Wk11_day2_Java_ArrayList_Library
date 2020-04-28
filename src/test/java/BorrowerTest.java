import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book1;
    private Book book2;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        book1 = new Book( "Harry Potter", "J K Rowling", "Fiction");
        book2 = new Book( "Five Foxes in the Forest", "Matt Handy", "Horror");
        library = new Library( "Central", 2);
        borrower = new Borrower( "Sid");
    }

    @Test
    public void getName(){
        assertEquals( "Sid", borrower.getName());
    }

    @Test
    public void addBook(){
        borrower.add(book1);
        assertEquals(1, borrower.collectionCount() );
    }

    @Test
    public void addBookFromLibrary() {
        library.add(book1);
        borrower.pickUp(library, book1);
        assertEquals( 0, library.stockCount());
        assertEquals( 1, borrower.collectionCount());
    }
}
