
@FunctionalInterface
interface Calculator{
    int operation(int a, int b);
}

interface A{
    void show();
}

// in functional interface you can only one abstract method inside interface


public class Demo {

    public static void main(String[] args){

        // lambda expression

        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.operation(5, 6));
        System.out.println("Multiply: " + multiply.operation(5, 6));


        A obj = () -> System.out.println("inside lambda function");
        obj.show();
    }
}