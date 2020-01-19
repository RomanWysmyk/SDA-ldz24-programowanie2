package pl.sdaacademy.intermediate.basic.Streams;

public class Person {

    String Name;
    String nazwisko;
    String miasto;
    int Age;
    double drugaliczna;


    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public Person(String imie, String nazwisko, String miasto, int liczba, double drugaliczna) {
        this.Name = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.Age = liczba;
        this.drugaliczna = drugaliczna;
    }


}
