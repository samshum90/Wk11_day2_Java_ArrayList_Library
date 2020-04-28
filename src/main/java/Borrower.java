import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower( String name ) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void add(Book book) {
        this.collection.add(book);
    }

    public void pickUp(Library library, Book book) {
        Book bookBorrowed = library.remove(book);
        this.add(bookBorrowed );
    }
}
