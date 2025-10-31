// Create a Java class named Book to represent a book. The class should have the following features:
// Instance Variables:
// title (String): to store the title of the book.
// author (String): to store the name of the author.
// year (int): to store the publication year of the book.

import java.util.Scanner;

public class Book {
    String title;
    String author;
    int year;

    // Default Constructor
    Book() {
        title = "Not specified";
        author = "Unknown";
        year = 0;
    }

    // Parameterized Constructor
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book();  // Calls default constructor
        Book book2 = new Book("Java Programming", "Sakshi", 2024);  // Calls parameterized constructor

        System.out.println("Book 1:");
        book1.displayInfo();

        System.out.println("Book 2:");
        book2.displayInfo();
    }
}
