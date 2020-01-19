package pl.sdaacademy.intermediate.basic.Zadanie5Dziedziczenie;

public class MobileDeveloper extends Developer {
    String mobileOs;

    public MobileDeveloper(String name, String company, double salary) {
        super(name, company, salary);
    }

    @Override
    public void makeCode() {

        System.out.println("Ania is coding for Google for 100000.0 in Android");


    }
}
