package pl.sdaacademy.intermediate.basic.Zadanie2Listy;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        Person newPerson = new Person("Jack", "Sparrow","Tortuga",45,530202104);
        Person newPerson2 = new Person("Jacek", "Jastrzębski","Zgierz",51,610202201);
        Person newPerson3 = new Person("Ala", "Udok","Wołyń",22,710202201);
        Person newPerson4 = new Person("Włodek", "Mako","Wieden",11,123123332);
        Person newPerson5 = new Person("Kasia", "Dede","Krakow",41,123202201);

        List<Person> lista = new ArrayList<>();

        lista.add(newPerson);
        lista.add(newPerson2);
        lista.add(newPerson3);
        lista.add(newPerson4);
        lista.add(newPerson5);

        System.out.println(lista);
        Person.showAge(lista);
        Person.showPhone(lista);
        Person.sumOfYears(lista);

        List<Person> lista2 = new ArrayList<>(lista);

        Person.deleteMiddle(lista);
        Person.showBothListAges(lista,lista2);
        Person.showAllPiecesOfLists(lista,lista2);

        
    }
}
