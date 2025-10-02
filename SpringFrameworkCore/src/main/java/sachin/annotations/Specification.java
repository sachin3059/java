package sachin.annotations;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("specification1") //  marks this class as spring bean  => no need for xml now
public class Specification {

    @Value("bmw")
    private String make;

    @Value("bmw@123")
    private String model;

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
