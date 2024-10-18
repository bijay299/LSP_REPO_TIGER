/**
 * This class tests the Book class to make sure everything works.
 */
public class BookDriver {
 static void main(String[] args) {
        // Create a few Book objects to play with
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Test if book1 and book2 are considered equal (they should be!)
        System.out.println(book1.equals(book2)); // true

        // Check if book1 and book3 are different (they are)
        System.out.println(book1.equals(book3)); // false

        // Print out the details of book1
        System.out.println(book1); // Should print: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}
