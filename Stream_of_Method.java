import java.util.stream.Stream;

public class Stream_of_Method {
    public static void main(String[] ar){
        //Stream of numbers
        Stream<Integer> num = Stream.of(1,2,3,4,5,6,7);
        num.forEach(System.out::println);

        System.out.println();
        //anonymous array object
        Stream<Integer> number = Stream.of(new Integer[]{1,2,3,45,6,9,7});
        number.forEach(System.out::println);
    }
}
