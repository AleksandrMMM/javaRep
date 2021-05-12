package Task4;

public class MainConvert {
    public static void main(String[] args) {
        Currency dollar = new Dollar();
        System.out.println(dollar.exchange("7000E"));


    }

    public static void createCurrency(int numb) {
        Currency[] currencies = new Currency[] {
            new Dollar(),
                new Evro(),
                new Ruble()
        };

    }

}
