package homeWork2.task2;

import java.util.ArrayList;

public class Util {

<T, K> void  print(T one, K two) {
    System.out.println(one);
    System.out.println(two);

    }
// не понял как добавить в лист объект класса

    public static <E> void create(Class1 class1) {
        ArrayList<E>  list = new ArrayList<>();
        list.add((E) class1.getOne());


    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();


    }



}
