import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_methods {
    public static void main(String[] ar){
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> even = number.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers : "+even);

        List<Integer> odd = number.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());

        System.out.println("Odd Numbers : "+odd);
    }
}
