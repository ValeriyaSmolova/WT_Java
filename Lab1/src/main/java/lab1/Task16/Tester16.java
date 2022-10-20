package main.java.lab1.Task16;

import main.java.lab1.Task15.Book;

import java.util.*;

public class Tester16 {
    public static void test() {


        Collection<Book> books = Set.of(
                new Book("Портрет Дориана Грея", "Оскар Уайльд", 140, 23),
                new Book("Горе от ума", "Грибоедов", 119, 1),
                new Book("Над пропастью во ржи", "Сэлинджер", 60, 5),
                new Book("Бедные люди", "Достоевский", 40, 12)
        );
        List<Book> bookList = new ArrayList<>(books);

        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);

        Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthor);

        Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle);

        Comparator<Book> authorTitlePriceComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .thenComparing(Book::getPrice);

        bookList.sort(titleComparator);
        System.out.println(bookList);

        bookList.sort(titleAuthorComparator);
        System.out.println(bookList);

        bookList.sort(authorTitleComparator);
        System.out.println(bookList);

        bookList.sort(authorTitlePriceComparator);
        System.out.println(bookList);
    }
}
