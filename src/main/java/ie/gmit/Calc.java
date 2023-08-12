package ie.gmit;
import java.util.Scanner;
public class Calc
{
    public static void main(String[] args)
    {
        add();
    }

    private static void add()
    {
        System.out.println("Please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstName= inputs.nextInt();

        System.out.println("Please your Second number: ");
        int secondName= inputs.nextInt();

        int total = firstName - secondName;
        System.out.println("The total is: " + total);

    }


}
