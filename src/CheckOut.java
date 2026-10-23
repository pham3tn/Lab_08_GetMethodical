import java.util.Scanner;

public class CheckOut {
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        double itemPrice = 0;
        double totalCost = 0;

        do{
            itemPrice = SafeInput.getRangedDouble(in, "Enter your item price",.5,10.0 );
            totalCost +=itemPrice;

        } while (SafeInput.getYNConfirm(in,"Do you still have more items to enter?"));

        System.out.printf("%s%.2f\n", "The total cost of your purchase is $", totalCost);
    }
}
