
package com.hashing;

public class HashApp {

    private static String[][] library = new String[3][3];

    static int shelves = 3;
    static int locations = 3;

    public static void main(String[] args) {

        Book book1 = new Book(1, "Java Programming");
        Book book2 = new Book(2, "Python Basics");
        Book book3 = new Book(3, "Data Structures");
        Book book4 = new Book(4, "Database Management");

        book1.address = findAddress(book1);
        book2.address = findAddress(book2);
        book3.address = findAddress(book3);
        book4.address = findAddress(book4);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        System.out.println("******** BOOK ADDRESS DETAILS ********");

        String address = "3#S1#L1";

        String[] parts = address.split("#");

        System.out.println("Book ID: " + parts[0]);
        System.out.println("Shelf: " + parts[1]);
        System.out.println("Location: " + parts[2]);
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
