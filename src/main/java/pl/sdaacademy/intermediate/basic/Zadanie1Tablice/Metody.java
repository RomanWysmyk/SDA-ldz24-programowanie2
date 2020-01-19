package pl.sdaacademy.intermediate.basic.Zadanie1Tablice;

import java.lang.reflect.Array;
import java.util.*;

public class Metody {

    public static Integer[] tablica() {

        Integer[] tablica = new Integer[10];

       return tablica;
    }

    public static void reveseArray (Integer[] x){

        List<Integer> listaReverse = Arrays.asList(x);
        listaReverse.sort(Comparator.reverseOrder());

        System.out.println(listaReverse);

    }

    public static void onlyNieparzyste (Integer[] x){

        for (int i = 0; i<x.length ; i++){

        }

    }
}
