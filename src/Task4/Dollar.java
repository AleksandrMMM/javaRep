package Task4;

public class Dollar extends Currency {

    @Override
    public double exchange(String amaunt) {
        char[] valute = amaunt.toCharArray();
        amaunt =  amaunt.substring(0, amaunt.length() - 1);
        double a = Double.parseDouble(amaunt);
        double c = 0.00;
        if (valute[valute.length - 1] == 'R') {
            c = a / 70;
        } else if (valute[valute.length - 1] == 'E') {
            c = a * 1.2;
        }
        return c;
    }
}
