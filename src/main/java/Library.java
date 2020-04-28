import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> stock;

    public Library( String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }


    public int stockCount() {
       return this.stock.size();
    }

    public void add(Book book) {
        if( this.stockCount() < this.capacity) {
            this.stock.add(book);
        }
    }

    public Book remove(Book book) {
        this.stock.remove(book);
        return book;
    }
}
