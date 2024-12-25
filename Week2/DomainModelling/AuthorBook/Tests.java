package AuthorBook;

public class Tests {
    public static void main(String[] args) {
        // Test case 1
        Book casualVacancy = new Book("The Casual Vacancy", new Author("J.K. Rowling", "rowling@casual.com", 'f'),
                29.95);
        System.out.println(casualVacancy);

        // Test case 2
        Author jkRowling = new Author("J.K. Rowling", "jkrowling@hogwarts.com", 'f');
        System.out.println(jkRowling);

        jkRowling.setEmail("rowling@hogwarts.com");
        System.out.println("Author's name is: " + jkRowling.getName());
        System.out.println("Author's email is: " + jkRowling.getEmail());
        System.out.println("Gender of the author is: " + jkRowling.getGender());

        Book harryPotter = new Book("Harry Potter", jkRowling, 39.95, 500);
        System.out.println(harryPotter);

        harryPotter.setPrice(49.95);
        harryPotter.setQty(450);
        System.out.println("Name of book is: " + harryPotter.getName());
        System.out.println("Price of book is: " + harryPotter.getPrice() + " USD");
        System.out.println("Qty is: " + harryPotter.getQty());
        System.out.println("Author is: " + harryPotter.getAuthor());
        System.out.println("Author's name is: " + harryPotter.getAuthorName());
        System.out.println("Author's email is: " + harryPotter.getAuthorEmail());
    }
}
