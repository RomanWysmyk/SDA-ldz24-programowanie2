package pl.sdaacademy.intermediate.basic.Zadanie6Polimorfizm;

public class Bicycle implements Vehicle {
    private static final int MAX_SPEED=50;
    public int speed = 0;

    public Bicycle(){
    }

    @Override
    public void accelerate() {
        speed += 5;
        if(speed>MAX_SPEED) {
            speed -= 5;
            System.out.println("Już więcej się nie da przyspieszyc. Jedziesz z predkoscia: "+speed);
        }
        else System.out.println("Przyspieszasz. Jedziesz z predkoscia: "+speed);

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
