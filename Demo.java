// inner class: a class is defined inside another class.
// types of inner class:

// 1. member inner class
// 2. static nested class
// 3. local inner class
// 4. anonymous inner class


// 1: member inner class:
class Outer{
    private String msg = "hello from outer";

    class Inner{
        void display(){
            System.out.println("displaying msg of outer class from inner class: " + msg);
        }
    }
}


// 2: static nested class
class A{
    static String msg = "Hello from static outer class";

    static class Nested {
        void display(){
            System.out.println(msg);
        }
    }
}


// 3. Local inner class => defined inside a method, constructor or block, scope is limited onto that block

class B{
    void bMethod(){
        class Nested{
            void display(){
                System.out.println("inner class defined inside the mentod of outer class");
            }
        }

        Nested nes = new Nested();
        nes.display();
    }
}




public class Demo{
    public static void main(String[] args){
        Outer out = new Outer();
        Outer.Inner inn = out.new Inner();
        inn.display();


        A.Nested nes = new A.Nested(); // here no outer object is needed due to static keyword.
        nes.display();


        B b = new B();
        b.bMethod();
    }
}