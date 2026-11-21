package com.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap {

    private static String[][] library = new String[100][100];

    static int shelves = 100;
    static int locations = 100;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book book1 = new Book(1, "Java Programming");
        Book book2 = new Book(2, "Python Basics");
        Book book3 = new Book(3, "Data Structures");
        Book book4 = new Book(4, "Database Management");

        book1.address = findAddress(book1);
        book2.address = findAddress(book2);
        book3.address = findAddress(book3);
        book4.address = findAddress(book4);

        Map<Integer, Book> books = new HashMap<>();

        books.put(book1.id, book1);
        books.put(book2.id, book2);
        books.put(book3.id, book3);
        books.put(book4.id, book4);

        System.out.println("******** BOOK LIBRARY ********");
        System.out.print("Enter Book ID to search: ");

        int bookId = sc.nextInt();

        Book selectedBook = books.get(bookId);

        if (selectedBook != null) {
            System.out.println(selectedBook);
        } else {
            System.out.println("Book not available!");
        }

        sc.close();
    }

    private static String findAddress(Book book) {

        int shelf = book.id % shelves;

        for (int i = 0; i < locations; i++) {

            if (library[shelf][i] == null) {

                library[shelf][i] = "Book: " + book.id;

                return book.id + "#S" + (shelf + 1) + "#L" + (i + 1);
            }
        }

        return null;
    }
}