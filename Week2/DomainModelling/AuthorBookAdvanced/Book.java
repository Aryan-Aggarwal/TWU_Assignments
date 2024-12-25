package AuthorBookAdvanced;

public class Book {
    private String title;
    private Author[] authors;
    private double price;
    private int qty;

    public Book() {
    }

    public Book(String title, Author[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public Book(String title, Author[] authors, double price, int qty) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append("\n");
        }
        return authorNames.toString().trim(); // Remove trailing newline
    }

    @Override
    public String toString() {
        StringBuilder authorDetails = new StringBuilder();
        for (Author author : authors) {
            authorDetails.append(author.toString()).append("\n");
        }
        return "Book Details:\n" +
                "Title: " + title + "\n" +
                "Authors:\n" + authorDetails.toString().trim() + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + qty;
    }
}
