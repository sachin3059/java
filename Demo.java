import java.util.*;
import java.util.stream.Collectors;

public class Demo{
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Alice", "Bob", "David", "Aman");


        List<String> res = new ArrayList<>();
        for(String name: names){
            if(name.startsWith("A")){
                res.add(name.toUpperCase());
            }
        }

        System.out.println(res);


        // stream api => is used for processing collection of data(like arrays, list, sets or maps) in a declartive way
        // such as filtering, mapping, reducing, etc.

        List<String> students = Arrays.asList("Abhinash", "Lokendra", "Gulshan", "Adarsh", "Ankur", "Sachin");

        List<String> temp = students.stream()
                                            .filter(student -> student.startsWith("A"))
                                            .map(String:: toUpperCase)
                                            .collect(Collectors.toList());

        System.out.println(temp);
    }
}