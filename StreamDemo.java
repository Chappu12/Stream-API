//Filtering the name which starts with 'R' character with Stream API
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] ar){
        List<String> list = Arrays.asList("Raj","Rahul","Ankit","Roshan","Scott");

        List<String> result = list.stream()
                .filter(name -> name.startsWith("R"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
