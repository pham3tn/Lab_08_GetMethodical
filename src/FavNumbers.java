import java.util.Scanner;

public class FavNumbers {
    public static void main()
    {
        Scanner in = new Scanner(System.in);

        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in,"Enter your favorite integer");
        IO.println("You said your favorite number is " + favInt);

        favDouble = SafeInput.getDouble(in,"Enter your favorite double");
        IO.println("You said your favorite double is "+favDouble);
    }
}
