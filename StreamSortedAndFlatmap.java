import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedAndFlatmap {
    public static void main(String[] ar){
        List<List<String>> nested = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C"));
        List<String> flattened = nested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattened);

        List<Integer> list = Arrays.asList(1,7,8,9,6,4,2,5,3,6);

        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
