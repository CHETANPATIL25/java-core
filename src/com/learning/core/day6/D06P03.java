package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book> 
{
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;

    public Book(int bookId, String title, double price, String author, Date publicationDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return bookId + " " + title + "\n" +
                ((author != null) ? author + "\n" : "") +
                ((price != 0) ? price + "\n" : "") +
                ((publicationDate != null) ? publicationDate + "\n" : "");
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, author, publicationDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publicationDate, book.publicationDate);
    }

    @Override
    public int compareTo(Book other) {
        return this.bookId - other.bookId;
    }

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        TreeSet<Book> bookSet = new TreeSet<>();

        bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(2020, 2, 2)));
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(1997,5,19)));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(1997, 4, 19)));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(1984, 10, 19)));
        bookSet.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(1984, 2, 6)));
       
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}