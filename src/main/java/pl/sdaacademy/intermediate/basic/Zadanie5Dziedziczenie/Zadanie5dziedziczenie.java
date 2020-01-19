package pl.sdaacademy.intermediate.basic.Zadanie5Dziedziczenie;

public class Zadanie5dziedziczenie {
    public static void main(String[] args) {

        Developer dev1 = new MobileDeveloper("Ania","Google",100000);
        Developer dev2 = new FrontenedDeveloper("Adam","SDA",999);
        Developer dev3 = new BackendDeveloper("Piotr","Ericson",0.5);

        dev1.makeCode();
        dev2.makeCode();
        dev3.makeCode();

    }
}
