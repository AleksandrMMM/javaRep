package Task6;
// как сделать отладку
public class MainTask8 {
    public static void main(String[] args) {
        System.out.println(pow1(2, 3));

    }

    public static int pow1(int a, int b) {
        int i = 1;
        int  c = a;
        while (i <  b) {
          c = c * a;
            i++;
        }
        return c;
    }
}
