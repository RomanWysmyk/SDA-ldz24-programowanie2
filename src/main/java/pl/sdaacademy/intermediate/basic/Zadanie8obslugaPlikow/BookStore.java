package pl.sdaacademy.intermediate.basic.Zadanie8obslugaPlikow;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class BookStore {
    List<Book> bookList;

    public BookStore(List<Book> bookList) {
        this.bookList = bookList;
    }

    static List searchByTitle() throws IOException {
        List<Book> bookList = BookStoreInitializer.initBookStore();

        List nowaLista = bookList
                .stream()
                //.filter(book -> book.getAuthor())
                .collect(Collectors.toList());
        System.out.println(nowaLista);
        return nowaLista;
    }

    static List searchByAuthor() throws IOException {
        List<Book> bookList = BookStoreInitializer.initBookStore();

        List nowaLista = bookList
                .stream()
                .map(book -> book.author)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nowaLista);
        return nowaLista;
    }
}
