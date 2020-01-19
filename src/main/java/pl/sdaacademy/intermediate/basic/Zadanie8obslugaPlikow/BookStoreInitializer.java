package pl.sdaacademy.intermediate.basic.Zadanie8obslugaPlikow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BookStoreInitializer {

    public static List initBookStore() throws IOException {


        BufferedReader wczytywacz = new BufferedReader(new FileReader("books.txt"));

        List<Book> listaKsiazek = new LinkedList();
        String obecnaLinia;

        for (int i = 0; i < 36; i++) {
            obecnaLinia = wczytywacz.readLine();
            String parts[] = obecnaLinia.split("\\|");
            Book book = new Book(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Double.parseDouble(parts[4]), Genre.valueOf(parts[5]));

            listaKsiazek.add(book);
            //System.out.println(book.toString());
        }

        //System.out.println(listaKsiazek);


        return listaKsiazek;

    }
}
