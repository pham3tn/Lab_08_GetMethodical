import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double cVal = 0;
        double fVal = 0;
        System.out.printf("%6s\t%6s\n", "Celsius", "Fahrenheit");

        for (cVal = -100; cVal <= 100; cVal++) {
            fVal = CtoF(cVal);
            System.out.printf("%7.0f\t%10.2f\n", cVal, fVal);

        }

    }

    public static double CtoF(double Celsius) {

        return (Celsius * 9.0 / 5) + 32;
    }
}
