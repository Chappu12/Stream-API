import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {
    public static void main(String[] ar){
        List<Integer> list = Arrays.asList(1,2,3,3,3,4,5,6,7,8,9,1,2,3,4);

        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
