/*  Created by IntelliJ IDEA.
 *  User: Ojasva Saxena
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;
import java.util.Objects;
public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    // Parameterized Constructor
    public Book(String bookName, String authorName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }

    // Non-Parameterized Constructor
    public Book() {
        this.bookName = null;
        this.authorName = null;
        this.ISBNNumber = null;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this. bookName= bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    @Override
    public String toString() {
        return "Book Name: " + getBookName() + ", " +
                "Author Name: " + getAuthorName() + ", " +
                "13-Digit ISBN Number: " + getISBNNumber() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getISBNNumber(), book.getISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getISBNNumber());
    }
}
