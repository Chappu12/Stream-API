import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_FilterStartsWith {
    public static void main(String[] ar){
        List<String> list = Arrays.asList("prathamesh","star","sing","mad","max","system","sex");

        List<String> result = list.stream()
                .filter(name -> name.startsWith("s"))
                .collect(Collectors.toList());

        //when have to iterate through each element then we have to use the foreach loop
        result.forEach(System.out::println);

        //and we have to only show the list then
        System.out.println(result);
    }
}
