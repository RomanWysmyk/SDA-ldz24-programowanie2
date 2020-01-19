package pl.sdaacademy.intermediate.basic.Zadanie1Tablice;

import java.util.Random;

public class Zadanie1Tablice {
    public static void main(String[] args) {


        Integer[] arraySimple = Metody.tablica();
        for(int i =0;i<10;i++){
            arraySimple[i] = i;
            System.out.println(arraySimple[i]);
        }
        System.out.println("-----------------------");

        Integer[] arrayFibbonaci = Metody.tablica();
        arrayFibbonaci[0]=0;
        arrayFibbonaci[1]=1;
        System.out.println(arrayFibbonaci[0]);
        System.out.println(arrayFibbonaci[1]);

        for (int i = 2; i<arrayFibbonaci.length; i++){

            arrayFibbonaci[i] = arrayFibbonaci[(i-2)]+arrayFibbonaci[(i-1)];

            System.out.println(arrayFibbonaci[i]);
        }

        System.out.println("--------------------------");

        Integer[] arrayRandom = Metody.tablica();

        Random rand = new Random();

        for (int i = 0; i<arrayRandom.length; i++){

            arrayRandom[i]= rand.nextInt(31);

            System.out.println(arrayRandom[i]);
        }

        Metody.reveseArray(arraySimple);



    }


}
