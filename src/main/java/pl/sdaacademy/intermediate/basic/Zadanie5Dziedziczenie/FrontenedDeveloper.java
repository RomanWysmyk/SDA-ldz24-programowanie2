package pl.sdaacademy.intermediate.basic.Zadanie5Dziedziczenie;

public class FrontenedDeveloper extends Developer {
    String javaScriptFramework;

    public FrontenedDeveloper(String name, String company, double salary) {
        super(name, company, salary);
    }

    @Override
    public void makeCode() {

        System.out.println("Adam is coding for SDA for 999.99 in Angular");

    }
}
