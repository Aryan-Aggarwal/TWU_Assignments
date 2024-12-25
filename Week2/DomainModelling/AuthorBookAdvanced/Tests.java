package AuthorBookAdvanced;

class Tests {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter and the Philosopher's Stone", new Author[] {
                new Author("J.K. Rowling", "jk.rowling@fiction.org", 'f')
        }, 399.99, 200);

        System.out.println("Author Names: ");
        System.out.println(book.getAuthorNames());
        System.out.println("Book Details: ");
        System.out.println(book);
    }
}
