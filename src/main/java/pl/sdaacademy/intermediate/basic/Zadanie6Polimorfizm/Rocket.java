package pl.sdaacademy.intermediate.basic.Zadanie6Polimorfizm;

public class Rocket implements Vehicle {
    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private int speed = 0;

    public Rocket() {

    }

    @Override
    public void accelerate() {
        speed += 1000;
        if (speed > MAX_SPEED) {
            speed -= 1000;
            System.out.println("Już więcej się nie da przyspieszyc. Jedziesz z predkoscia: " + speed);
        } else System.out.println("Przyspieszasz. Jedziesz z predkoscia: " + speed);

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
