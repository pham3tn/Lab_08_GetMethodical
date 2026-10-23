import java.util.Scanner;

public class GetUserName {
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String userName = "";

        userName = SafeInput.getNonZeroLenString(in,"Enter your username");
        IO.println("You said your username is: " + userName);
    }
}
