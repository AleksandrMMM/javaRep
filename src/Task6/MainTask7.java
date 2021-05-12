package Task6;

import java.util.Scanner;

/**
 * Реализовать округление по правилам математики (не использовать
 * Math.round)
 */
public class MainTask7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.printf("%d", a - (a % 100));
    }
}
