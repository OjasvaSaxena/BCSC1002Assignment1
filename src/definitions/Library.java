/*  Created by IntelliJ IDEA.
 *  User: Ojasva Saxena
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;
import java.util.Arrays;
public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 5;
    private Book[] booksAvailable;

    // Parameterized Constructor
    public Library(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    // Non-Parameterized Constructor
    public Library() {
        this.booksAvailable = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            this.booksAvailable[libraryIndex] = new Book();
        }
    }

    public Book[] getBooksAvailable() {
        return booksAvailable;
    }

    public void setBooksAvailable(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    @Override
    public String toString() {
        return Arrays.toString(booksAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksAvailable(), library.getBooksAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksAvailable());
    }

    /**
     * This method will set the Information of books available in Library.
     */
    public void setBooksInLibrary() {
        booksAvailable[0].setBookName("Mathematics");
        booksAvailable[0].setAuthorName("R.D Sharma");
        booksAvailable[0].setISBNNumber("5834627106732");
        booksAvailable[1].setBookName("Science");
        booksAvailable[1].setAuthorName("Evergreen Publications");
        booksAvailable[1].setISBNNumber("7894321875632");
        booksAvailable[2].setBookName("Computer Science");
        booksAvailable[2].setAuthorName("Arihant");
        booksAvailable[2].setISBNNumber("9753714632984");
        booksAvailable[3].setBookName("Software Engineering");
        booksAvailable[3].setAuthorName("Dr. Mathur");
        booksAvailable[3].setISBNNumber("5648248906345");
        booksAvailable[4].setBookName("English");
        booksAvailable[4].setAuthorName("Dr. Kushwaha");
        booksAvailable[4].setISBNNumber("4573211985935");
    }

    /**
     * This method will show the Information of books available in Library.
     */
    public void showAvailableBooks() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("|%-36s %-21s %-21s|\n", "Book Name", "Author Name", "13-Digit ISBN Number");
        System.out.println("----------------------------------------------------------------------------------");
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            System.out.printf("|%-36s %-21s %-21s|\n", booksAvailable[libraryIndex].getBookName(), booksAvailable[libraryIndex].getAuthorName(), booksAvailable[libraryIndex].getISBNNumber());
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}
