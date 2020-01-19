package pl.sdaacademy.intermediate.basic.Zadanie2Listy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private String placeOfBirth;
    private int age;
    private long phome;

    public Person(String name, String surname, String placeOfBirth, int age, long phome) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.age = age;
        this.phome = phome;
    }

    @Override
    public String toString() {
        return name+" "+surname+" ("+(2020-age)+" r.)"+"\n" +
                ""+"m. ur. :"+placeOfBirth+"\n" +
                ""+"tel: "+phome;
        // metoda zła bo dubluje stringi

    }


    public String toString2() {
        return String.format("%s %s %s %s %s \n" +
                "%s %s \n" +
                "%s %s",name,surname,"(ur.",(LocalDate.now().getYear() -age),"r.)","m. ur.:",placeOfBirth,"tel:",phome);
        // metoda dobra bo łaczy stringi i mniej zabiera pamięci
    }

    public static void showAge(List<Person> listOfPerson){

        for (int i =0; i<listOfPerson.size();i++){

            if(listOfPerson.get(i).age>20)

            System.out.println(listOfPerson.get(i).age);
        }


    }
    public static void showPhone(List<Person> listOfPerson){

        for (int i =0; i<listOfPerson.size();i++){

            if(listOfPerson.get(i).phome%2==0){
                System.out.println(listOfPerson.get(i).phome);
            }
        }

    }
    public static void sumOfYears(List<Person> listOfPerson){
        int allYears=0;
        for (int i =0; i<listOfPerson.size();i++){


            allYears+=listOfPerson.get(i).age;
        }
        System.out.println("Wszystkich wiek to "+allYears);
    }

    public static void deleteMiddle(List<Person> listOfPerson){

        System.out.println("przed usunieciem "+listOfPerson);

        int middle = listOfPerson.size()/2;
        listOfPerson.remove(middle);

        System.out.println("po usunieciu "+listOfPerson);
    }

    public static void showBothListAges(List<Person> listOfPerson,List<Person> listOfPerson2) {
        int allYears=0;
        for (int i =0; i<listOfPerson.size();i++){


            allYears+=listOfPerson.get(i).age;
        }
        System.out.println("Wszystkich wiek z listy 1 to "+allYears);
        int allYears2=0;
        for (int i =0; i<listOfPerson2.size();i++){


            allYears2+=listOfPerson2.get(i).age;
        }
        System.out.println("Wszystkich wiek z listy 2 to "+allYears2);


    }
    public static void showAllPiecesOfLists(List<Person> listOfPerson,List<Person> listOfPerson2){

        System.out.println("Ilosc elementow z listy 1 to: "+listOfPerson.size());
        System.out.println("Ilosc elementow z listy 2 to: "+listOfPerson2.size());

    }



}
