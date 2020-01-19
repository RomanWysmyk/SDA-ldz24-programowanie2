package pl.sdaacademy.intermediate.basic.Zadanie6Polimorfizm;

public class Zadanie6Poli {

    public static int moveNTimesFast(Vehicle vehicle, int times){

        int newMax = vehicle.getSpeed()*times;

        System.out.println("Nowa prędkość po przyśpieszeniu: "+newMax);

        return newMax;
    }
    public static void main(String[] args) {

        Vehicle motor = new Motorbike();
        Vehicle rower = new Bicycle();
        Vehicle rakieta = new Rocket();

        motor.accelerate();
        rower.accelerate();
        rakieta.accelerate();

        moveNTimesFast(rower,5);


    }
}
