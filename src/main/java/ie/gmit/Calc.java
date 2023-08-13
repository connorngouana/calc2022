package ie.gmit;
import java.util.Scanner;
public class Calc
{
    public static void main(String[] args)
    {
        multiply();
    }

    private static void multiply()
    {
        System.out.println("Please your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your Second number: ");
        int secondNumber= inputs.nextInt();

        System.out.println("Please your Second number: ");
        int thirdNumber= inputs.nextInt();

        int total = firstNumber * secondNumber * thirdNumber;
        System.out.println("The total is: " + total);

    }


}
