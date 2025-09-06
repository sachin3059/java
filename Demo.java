import java.util.*;
import java.util.stream.Collectors;

public class Demo{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // parallelStream => multi- threaded stream processing

        int sum = numbers.parallelStream()
                                        .mapToInt(Integer::intValue)
                                        .sum();
    
        System.out.println(sum);

    }
}