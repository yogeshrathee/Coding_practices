package org.example.Crio;
interface Engine{
    public void turnOn();
}


class  Combustion implements Engine{
    public void turnOn(){
        System.out.println("Combustion Car");
    }
}
public class Car {
    public Engine engine;
    public Car() {
        this.engine = new Combustion();

    }
    public void start () {
        engine.turnOn();
    }
    public static void main(String[] args) {


        Car car = new Car();
        car.start();
    }
}
