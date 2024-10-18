package org.howard.edu.lsp.midterm.question1;

/**
 * This class represents a book with basic info like title, author, ISBN, and when it was published.
 * It also includes methods to compare books and print their details.
 */
public class Book {
    private String title;      // Book title
    private String author;     // Book author
    private String ISBN;       // Book's unique ISBN number
    private int yearPublished; // The year the book was published

    /**
     * Constructor to initialize a new Book object with the given details.
     *
     * @param title The name of the book.
     * @param author The person who wrote the book.
     * @param ISBN The unique ID for the book.
     * @param yearPublished The year the book came out.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Simple getter methods to access private variables

    /** 
     * Gets the title of the book.
     * 
     * @return The book's title. 
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Gets the author of the book. 
     * 
     * @return The book's author. 
     */
    public String getAuthor() {
        return author;
    }

    /** 
     * Gets the ISBN of the book. 
     * 
     * @return The book's ISBN. 
     */
    public String getISBN() {
        return ISBN;
    }

    /** 
     * Gets the year the book was published.
     * 
     * @return The year it was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Checks if two books are equal. Here, we only care about the ISBN and author.
     * If those match, we assume the books are the same.
     *
     * @param obj The object to compare with.
     * @return True if both books have the same ISBN and author, otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // If both objects are the same, they're equal.
        if (!(obj instanceof Book)) return false;  // If it's not a Book, can't be equal.
        Book other = (Book) obj;  // Cast the object to a Book.
        return ISBN.equals(other.ISBN) && author.equals(other.author);
    }

    /**
     * Returns a string with the book's details, so when we print it, it looks nice.
     *
     * @return A string with the book's title, author, ISBN, and year.
     */
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Year Published: %d",
                title, author, ISBN, yearPublished);
    }
}
