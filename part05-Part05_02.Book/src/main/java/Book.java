public class Book {
    private String authorName;
    private String bookName;
    private int numPages;

    public Book (String authorName, String bookName, int numPages) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return this.authorName;
    }

    public String getName() {
        return this.bookName;
    }

    public int getPages() {
        return this.numPages;
    }

    public String toString() {
        return authorName + ", " + bookName + ", " + numPages + " pages";
    }
}
