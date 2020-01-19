package pl.sdaacademy.intermediate.basic.Zadanie4Set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Zadanie4Set {
    public static void main(String[] args) {

        Car auto1 = new Car("Volkswagen","Golf","1VWBH7A33DC118080");
        Car auto2 = new Car("Audi","A3","1FTSW21R08EC46917");
        Car auto3 = new Car("Seat","Leon","1FTFW1CF6EKF51253");
        Car auto4 = new Car("Audi","A3","1FMFU17538LA84228");
        Car auto5 = new Car("Seat","Ibiza","1FTFW1CF6EKF51253");
        Car auto6 = new Car("Volkswagen","Passat","1VWBH7A33DC118080");

        Set<Car> autos = new HashSet<>();
        List<Car> autos2 = new LinkedList<>();

        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
        autos.add(auto6);

        autos2.add(auto1);
        autos2.add(auto2);
        autos2.add(auto3);
        autos2.add(auto4);
        autos2.add(auto5);
        autos2.add(auto6);


        for (Car car: autos) {
            System.out.println(car.toString());
        }
        System.out.println("**********************************************");
        for (Car car: autos2) {
            System.out.println(car.toString());
        }
    }
}
