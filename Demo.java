abstract class A{
    public abstract void show();
}


public class Demo {
    public static void main(String[] args){
        // we are creating the object of anonymous inner class.

        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
