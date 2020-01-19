package pl.sdaacademy.intermediate.basic.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic {
    public static void main(String[] args) {


        /*Stream<String> namesStream = Stream.of("John", "Marry", "George", "Paul", "Alice", "Ann");
        namesStream
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");*/

        /*namesList
                .stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");

        /*namesList
                .stream()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                    return true;
                });   // brak operacji terminującej, wcześniejsza operacja pośrednia filter nie jest wykonana

        List<String> namesList = Arrays.asList("John", "Marry", "George", "Paul", "Alice", "Ann");*/

/*
        namesList
                .stream()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                    return true;
                })
                .forEach(name -> System.out.println("Now name is printed: " + name));
// operacja terminująca forEach dodana, wykonane obie operacje (filter i forEach) - wypisane 2 linie dla każdego imienia
*/


        /*Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .forEach(person -> System.out.println("Person: " + person.getName() + " is adult."));

*/

  /*      Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)

                // do tej pory mamy strumień elementów typu Person
                .map(person -> person.getName()) // albo z wykorzystaniem referencji do metody: Person::getName
                // teraz mamy strumień typu String!

                .forEach(name -> System.out.println("Person: " + name + " is adult."));
*/
        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        Long abx =allPersons
                .stream()
                .skip(0)
                .count();
        System.out.println(abx);

                //.forEach(person -> System.out.println("Hello, " + person.getName()));

        /*List<Person> allPersons2 = Arrays.asList(person1, person2, person3);
        allPersons2
                .stream()
                .limit(2)
                .forEach(person -> System.out.println("Hello, " + person.getName()));*/






    }




}
