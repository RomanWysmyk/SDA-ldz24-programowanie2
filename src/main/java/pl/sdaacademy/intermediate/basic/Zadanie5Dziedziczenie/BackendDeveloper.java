package pl.sdaacademy.intermediate.basic.Zadanie5Dziedziczenie;

public class BackendDeveloper extends Developer {

    String backendLanguage;

    public BackendDeveloper(String name, String company, double salary) {
        super(name, company, salary);
    }

    @Override
    public void makeCode() {

        System.out.println("Piotr is coding for Ericsson for 0.5 PLN in Java");
        System.out.println(name+" is coding for "+company+ "for+ "+super.salary);

    }
}
