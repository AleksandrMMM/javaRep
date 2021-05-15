package homeWork2.task2;

import java.util.ArrayList;

public class Class1<T, K> {
    private T one;
    private K two;

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public K getTwo() {
        return two;
    }

    public void setTwo(K two) {
        this.two = two;
    }

    public  void print(T one, K two) {
        System.out.println(one);
        System.out.println(two);
    }



   // ArrayList<T, K> list = new ArrayList<>();
    
}
