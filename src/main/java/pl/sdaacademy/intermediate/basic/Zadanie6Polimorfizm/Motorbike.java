package pl.sdaacademy.intermediate.basic.Zadanie6Polimorfizm;

public class Motorbike implements Vehicle {


    private static final int MAX_SPEED=300;
    private int speed = 0;

    public Motorbike(){

    }

    @Override
    public void accelerate() {

        speed += 30;
        if(speed>MAX_SPEED) {
            speed -= 30;
            System.out.println("Już więcej się nie da przyspieszyc. Jedziesz z predkoscia: "+speed);
        }
        else System.out.println("Przyspieszasz. Jedziesz z predkoscia: "+speed);

    }

    @Override
    public int getSpeed() {
        return speed;
    }

}
