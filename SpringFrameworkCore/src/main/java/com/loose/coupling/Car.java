package com.loose.coupling;

interface Engine{
    void start();
}

class PetrolEngine implements  Engine{
    public void start(){
        System.out.println("Petrol engine starting...");
    }
}

class ElectricEngine implements Engine{
    public void start(){
        System.out.println("Electric engine starting...");
    }
}





class Car1 {
    private  Engine engine;
    public Car1(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
    }
}

public class Car {
    public static void main(String[] args) {
        Engine petrol = new PetrolEngine();
        Engine electric = new ElectricEngine();

        Car1 c1 = new Car1(petrol);
        Car1 c2 = new Car1(electric);

        c1.drive();
        c2.drive();
    }
}


