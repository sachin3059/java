import java.util.*;
import java.util.stream.Collectors;

public class Demo{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int sumOfSquares = numbers.stream()
                            .filter(n -> n%2 == 0)
                            .map(n -> n * n)
                            .reduce(0, Integer :: sum);

        System.out.println(sumOfSquares);


        // notes: 
        
        // stream is basically an interface
        // you can't use stream again

    }
}