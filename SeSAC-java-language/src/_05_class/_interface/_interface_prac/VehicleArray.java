package _05_class._interface._interface_prac;

abstract class Vehicle {
    private String name;
    private int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void move();
}

interface Flyable {
    void fly();
}

class Car extends Vehicle {

    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " 도로를 따라 이동 중");
    }
}

class Airplane extends Vehicle implements Flyable {

    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " 하늘을 날아가는 중");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " 고도 10,000피트에서 비행 중");
    }
}

public class VehicleArray {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Car", 120);
        vehicles[1] = new Airplane("Airplane", 900);

        for (Vehicle v : vehicles) {
            v.move();
            if (v instanceof Flyable) {
                ((Flyable) v).fly();
            }
        }
    }
}
