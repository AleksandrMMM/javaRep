package H2Task4;

/**
 * Создать класс, представляющий собой счет в банке. Баланс счета
 * может быть представлен в виде int, double или String. В случае String:
 * «1000 RUB» (пример), в случае int или double – просто целое или
 * дробное число. Реализовать метод, возвращающий баланс в виде
 * целого числа.
 */
public class MainRun {

    int balance = 1000;
    double balance1 = 1000.00;
    String balance3 = "1000 RUB";

    public static <T> int ret(T value) {
        int value1 = 0;
        if (value instanceof Integer) {
           value1 = (int) value;
        }else if (value instanceof Double) {
            String s = String.valueOf(value);
            value1 = Integer.parseInt(s);
        }else if (value instanceof String) {

            String s = ((String) value).substring(0, ((String) value).length() - 4);
            value1 = Integer.parseInt(s);

        }

        return value1;



    }

    public static void main(String[] args) {
        MainRun  mainRun = new MainRun();

        System.out.println(ret(mainRun.balance));
        System.out.println(ret(mainRun.balance1));
        System.out.println(ret(mainRun.balance3));

    }


}

