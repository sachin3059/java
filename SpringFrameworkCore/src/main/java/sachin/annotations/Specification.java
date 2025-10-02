package sachin.annotations;


import org.springframework.stereotype.Component;

@Component //  marks this class as spring bean  => no need for xml now
public class Specification {
    private String make = "audi";
    private String model = "audi123";

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
