package pro.sky.java.course1.homeworkObCl;

public class Book {
    private final String bookName;
    private final Author author;
    private int yearOfPublishing;

    public Book(String bookName, Author author, int yearOfPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String toSee() {
        return "Название книги: " + getBookName() + "\nАвтор: " + author.toSeeFio() + "\nГод издания: " + getYearOfPublishing();
    }
}
