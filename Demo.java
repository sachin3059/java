enum Status{
    Running, Failed, Pending, Success;  // named constants
}

public class Demo {

    public static void main(String[] args){
        Status s = Status.Running;
        System.out.println(s);

        Status s1 = Status.Failed;
        System.out.println(s1.ordinal()); // gives 1 order of named constants
        

        Status[] s2 = Status.values(); // gives all object of Status class , status.values gives array
        for(Status ss: s2){
            System.out.println(ss);
        }
    }
}