package Task3;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        listAdd(list, 1);
        listAdd(list, 2);
        listAdd(list, 3);
        listAdd(list, 4);
        listAdd(list, 5);

        System.out.println(listContains(list, 2));

    }
    public static void listAdd(ArrayList<Integer> list, int a) {
        list.add(a);

    }
    public static void listDelete(ArrayList<Integer> list, int a) {
        list.remove(a);

    }
    public static boolean listContains(ArrayList<Integer> list, int a) {
        return list.contains(a);
    }
    public static void listSize(ArrayList<Integer> list, int a) {
        list.size();

    }
    public static void listEmpty(ArrayList<Integer> list, int a) {
        list.isEmpty();

    }
}
