import java.util.Scanner;

public class Reggie {
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        String ssnNum = "";
        String studentId = "";
        String menuChoice = "";

        ssnNum = SafeInput.getRegExString(in,"Enter your SSN number","^\\d{3}-\\d{2}-\\d{4}$");
        studentId= SafeInput.getRegExString(in,"Enter your UC student M number","^(M|m)\\d{5}$");
        menuChoice= SafeInput.getRegExString(in,"Enter your menu choice [OoSsVvQq]","^[OoSsVvQq]$");
    }
}
