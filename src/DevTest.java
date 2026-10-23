import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

/*
        String name = "";
        name =getNonZeroLenString(in,"Enter your name");
        IO.println("You said your name is "+name);






        int intVal = 0;
        intVal = getInt(in, "Enter an integer");


        double doubleVal = 0;
        doubleVal = getDouble(in, "Enter a double");



        int rangedInt =0;
        rangedInt = getRangedInt(in,"Enter an integer", 1,  11);


        double rangedDouble = 0;
        rangedDouble = getRangedDouble(in,"Enter a double", 1,20);





        int count = 0 ;
        do{
            IO.print("How many times do you want to say 'Hello'?: ");
            count = in.nextInt();
            in.nextLine();

            for(int i = 0; i<count; i++){
                IO.println("HELLO");
            }
        }while (getYNConfirm(in,"Do you want to try again?"));
*/

        String ssnNum = "";
        ssnNum = getRegExString(in,"Enter your SSN number","^\\d{3}-\\d{2}-\\d{4}$");
        IO.println("You said your SSN number is "+ssnNum);


    }

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash ="";
        int intVal = 0;

        do{
            IO.print("\n" + prompt + ": ");

            if(pipe.hasNextInt())
            {
                intVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                IO.println("You must enter a valid integer, not "+trash);
            }
        } while (!done);

        return intVal;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash ="";
        double doubleVal = 0;

        do{
            IO.print("\n" + prompt + ": ");

            if(pipe.hasNextDouble())
            {
                doubleVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                IO.println("You must enter a valid double, not "+trash);
            }
        } while (!done);

        return doubleVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        String trash = "";
        int rangedInt = 0;

        do{
            IO.print(prompt + " [" + low + "-" +high +"]: ");

            if(pipe.hasNextInt())
            {
                rangedInt = pipe.nextInt();
                pipe.nextLine();

                if(rangedInt >= low & rangedInt<=high)
                    done = true;

                else
                    IO.println("You must enter a valid value within the range [" + low + "-" +high +"]");

            }
            else{
                trash = pipe.nextLine();
                IO.println("You must enter a valid integer, not "+trash);
            }
        } while (!done);
        return rangedInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double rangedDouble = 0;
        boolean done = false;
        String trash = "";

        do{
            IO.print(prompt + " [" + low + "-" +high +"]: ");

            if(pipe.hasNextDouble())
            {
                rangedDouble = pipe.nextDouble();
                pipe.nextLine();

                if(rangedDouble >= low & rangedDouble<=high)
                    done = true;

                else
                    IO.println("You must enter a valid value within the range [" + low + "-" +high +"]");

            }
            else{
                trash = pipe.nextLine();
                IO.println("You must enter a valid double, not "+trash);
            }
        } while (!done);
        return rangedDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean returnValue = true;
        String response = "";
        String trash = "";

        do{
            IO.print(prompt + "[YyNn]: ");
            response = pipe.nextLine();

            if(response.isEmpty())
            {
                IO.println("You must enter [YyNn] ");
            }

            else if(response.equalsIgnoreCase("Y"))
            {
                done = true;
                returnValue = true;
            }

            else if(response.equalsIgnoreCase("N")) {
                done = true;
                returnValue = false;
            }

            else{
                IO.println("You must answer [Y/N], not " + response);
            }
        } while (!done);

        return returnValue;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx){
        boolean done = false;
        String retVal = "";

        do{
            IO.print(prompt +  ": ");
            retVal = pipe.nextLine();

            if(retVal.matches(regEx))
                done = true;
            else
                IO.println("You must enter a value that matches the regEx! ");

        } while (!done);

        return retVal;
    }
}