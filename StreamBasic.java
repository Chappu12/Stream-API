import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasic {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mad","prathamesh","note");

        Stream<String> obj = list.stream();
        obj.forEach(System.out::println);
    }
}
