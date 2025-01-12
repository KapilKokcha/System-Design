// It states that if a child class extends parent class then we should be able to replace the object of parent class with child class without changing the behaviour.

public class LiskovSubstitution {
}

interface Vehicle {
    void accelerate();
    // void hasEngine(); //this is wrong bcz what if a cycle extends it
}
interface MotorizedVehicle extends Vehicle {
    void hasEngine();  // Only motorized vehicles will have an engine
}

class Car implements MotorizedVehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void hasEngine() {
        System.out.println("This vehicle has an engine");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating");
    }
}

///////////////////////////Another example

// Parent class
class Bird {
    public void eat() {
        System.out.println("Eating");
    }
}

// Interface for flying birds
interface Flyable {
    void fly();
}

// Child class that can fly
class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

// Child class that cannot fly
class Penguin extends Bird {
    // No fly method here, just other bird behaviors
}
