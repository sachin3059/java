
@FunctionalInterface
interface A{
    void show();
}

// in functional interface you can only one abstract method inside interface


public class Demo {

    public static void main(String[] args){
      A obj = new A(){
        public void show(){
            System.out.println("in show");
        }
      };

      obj.show();
    }
}