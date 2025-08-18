abstract class Car{
    // here we a declaring the method
    public abstract void drive();

    public abstract void fly();

    public void palyMusic(){
        System.out.println("play music");
    }
}

// Important notes:

// we can't create a object of abstract class.
// abstract class may or may not contain abstract method.
// but if you have define abstract method in abstract class then you must have to implement in derived class.


class WagonR extends Car{
    public void drive(){
        System.out.println("driving the wagonr");
    }

    public void fly(){
        System.out.println("flying");
    }
}


public class Demo {

    public static void main(String[] args){
        WagonR obj = new WagonR();
        obj.drive();
        obj.palyMusic();
        obj.fly();

    }
}