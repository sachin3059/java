interface A{
    int age = 4;     // these variable are final and static
    String area = "mumbai";

    void show();
    void config();
}

// important notes:
// interface is not a abstract class
// by default every method inside the interface have abstract method whether you metioned or not
// interface are generally used in development mode.
// all variable inside the interface by default are static and final.

// a class can also implements multimple interfaces

interface X{
    void run();
}


interface Y extends X{
    void temp();
}

class B implements A, X{
    public void show(){
        System.out.println("in B show");
    }

    public void config(){
        System.out.println("in B config");
    }
    public void run(){
        System.out.println("in B run");
    }
}


public class Demo {
    public static void main(String[] args){
        // we are creating the object of anonymous inner class.

        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age); // we can acces the variable of interface without creating any object .


        X obj1 = new B();
        obj1.run();
    }
}



// class - class => extends
// class - interface => implements
// interface - interface => extends