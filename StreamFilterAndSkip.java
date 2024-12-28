import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterAndSkip {
    public static void main(String[] ar){
        List<String> list = Arrays.asList("Prathamesh","Dinesh","Mad","Max","Ajay","Shubham","Ram","Sham");

        List<String> result1 = list.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println("Skip Operation : "+result1);

        List<String> result2 = list.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Limit Operation : "+result2);
    }
}
