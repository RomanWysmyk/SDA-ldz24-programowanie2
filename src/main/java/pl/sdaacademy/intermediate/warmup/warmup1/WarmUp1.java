package pl.sdaacademy.intermediate.warmup.warmup1;

public class WarmUp1 {
    public static void main(String[] args) {

        Person newPerson = new Person("Jack", "Sparrow","Tortuga",45,530202101);
        Person newPerson2 = new Person("Jacek", "Jastrzębski","Zgierz",51,610202201);
        System.out.println(newPerson.toString());
        System.out.println("");
        System.out.println(newPerson2.toString());
        System.out.println("");
        System.out.println(newPerson.toString2());

    }
}
