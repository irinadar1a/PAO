package examples;

public class E_Aggregation_Composition {


}

class Page {
    private String content;
    public int numberOfPages;

    public Page(String content, int numberOfPages) {
        this.content        = content;
        this.numberOfPages  = numberOfPages;
    }
}

class Book {
    private String title; 			// Composition
    private Page[] pages; 			// Composition
    private LibraryRow libraryRow = null; 	// Aggregation

    public Book(int size, String title, LibraryRow libraryRow) {
        this.libraryRow = libraryRow;
        this.title = title;

        pages = new Page[size];

        for (int i = 0; i < size; i++) {
            pages[i] = new Page("Page " + i, i);
        }
    }
}

class LibraryRow {
    private String rowName = null; 		// Aggregation

    public LibraryRow(String rowName) {
        this.rowName = rowName;
    }
}

class Library {

    public static void main(String[] args) {
        LibraryRow row = new LibraryRow("a1");
        Book book = new Book(100, "title", row);

        // După ce nu mai există nici o referință la obiectul Carte,
        // Garbage Collector-ul va șterge (la un moment dat, nu
        // neapărat imediat) acea instanță, dar obiectul LibraryRow
        // transmis constructorului nu este afectat.

        book = null;
    }
}