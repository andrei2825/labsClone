package Task4;
import java.io.*;
import java.util.*;


public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        return "The title is: " + title +
                ", the author is: " + author +
                " and the year is: " + year;
    }
}