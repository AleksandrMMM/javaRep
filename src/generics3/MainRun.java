package generics3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRun {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(10, 20, 30, 40);
        List<Double> doubleList = Arrays.asList(10.0, 20.0);
        List<String> stringList = Arrays.asList("one", "two", "three");

        System.out.println(integerList);
        System.out.println(doubleList);
        System.out.println(stringList);

    }

    public static <T> void fill( List<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }

    }
}
