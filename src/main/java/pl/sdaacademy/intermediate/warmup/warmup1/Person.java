package pl.sdaacademy.intermediate.warmup.warmup1;

import java.time.LocalDate;

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
        // metoda dobra bo łłaczy stringi i mniej żre pamięci
    }
}
