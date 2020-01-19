package pl.sdaacademy.intermediate.basic.Zadanie8obslugaPlikow;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadanie8listaKsiazek {
    public static void main(String[] args) throws IOException {


        BookStoreInitializer.initBookStore();

        BookStore.searchByTitle();
        //BookStore.searchByAuthor();
        

    }
}
