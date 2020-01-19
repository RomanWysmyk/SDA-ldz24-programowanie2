package pl.sdaacademy.intermediate.basic.Zadanie4Set;

import java.util.Objects;

public class Car {

    String marka;
    String model;
    String vin;

    public Car(String marka, String model, String vin) {
        this.marka = marka;
        this.model = model;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }
}
