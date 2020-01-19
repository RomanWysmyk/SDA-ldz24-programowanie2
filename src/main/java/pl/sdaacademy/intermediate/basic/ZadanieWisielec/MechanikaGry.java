package pl.sdaacademy.intermediate.basic.ZadanieWisielec;


import java.util.Random;
import java.util.Scanner;

public class MechanikaGry {

    Scanner scan = new Scanner(System.in);


    public void playGame() {
        String name;
        int ileZyc;
        String[] tablicaSlow = {"makowiec", "lizak", "kozak"};
        Random random = new Random();
        String wybraneSlowo = tablicaSlow[random.nextInt(tablicaSlow.length)];

        String litera;
        System.out.println("-----------------------------------");
        System.out.println("-------------WISIELEC--------------");
        System.out.println("-----------------------------------");
        System.out.println("Jak masz na imie ?");
        name = scan.next();
        System.out.println("Witaj " + name + ". Zaczynamy grę:");
        System.out.println("Podaj poziom trudnosci : ");
        System.out.println("1. - latwy (20 szans)");
        System.out.println("2. - sredni (10 szans)");
        System.out.println("3. - trudny (5 szans)");
        int wybor = scan.nextInt();
        if (wybor == 1) ileZyc = 20;
        else if (wybor == 2) ileZyc = 10;
        else if (wybor == 3) ileZyc = 5;
        else {
            System.out.println("Zla odpowiedz wybrano ultra hard. Zgadnij od razu !!!!!");
            ileZyc = 1;
        }
        ;

        System.out.println("---------------------------------------------");

        System.out.println("Musisz zgadnąć słowo podając po 1 literze. Masz " + ileZyc + " szans");


        for (; ; ) {
            //System.out.println("cheat "+wybraneSlowo);
            System.out.println("Podaj litere: ");

            litera = scan.next();
            if (wybraneSlowo.equals(litera)) {
                System.out.println("Wyrałeś. Pozostało Ci " + ileZyc + " szans!");
                System.exit(0);

            } else if (wybraneSlowo.contains(litera)) {

                System.out.println("Dobrze --- to słowo zawiera taką litere!");

            } else {
                System.out.println("Nie ma takiej litery w tym słowie");
                ileZyc -= 1;
                System.out.println("Pozostało Ci " + ileZyc + " szans!");
                if (ileZyc == 0) {
                    System.out.println("Przegrales drabie");
                    System.exit(0);
                }
            }
        }


    }
}
