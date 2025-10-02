package sachin.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // mark this class as spring bean
public class Car {

    @Autowired // autowiring by type
    private Specification specification;

    public void display(){
        System.out.println(specification.toString());
    }
}
