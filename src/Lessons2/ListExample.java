package Lessons2;

public class ListExample<T> {
    T[] arr;
    int size;

    public void insert(T element) {
        arr[size++] = element;
    }



    public static void main(String[] args) {
        ListExample<Integer> list = new ListExample<>();

        ListExample<Double> listDouble = new ListExample<>();
    }
}