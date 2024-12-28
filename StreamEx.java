import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] ar){
        List<String> list = Arrays.asList("mad","prathamesh","note");

        Stream<String> obj = list.stream();
        obj.forEach(System.out::println);

    }
}
