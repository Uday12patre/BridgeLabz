import java.util.Scanner;

public class TemperatureConverter
{
    static double Tc; 
    static double Tf;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Temperature in Degree Celsius: ");
        Tc = scan.nextDouble();

        Tf = 32 + (Tc *(9.0/5.0));
        double TF = Tf - (int)(Tf); 
        System.out.println("(Int part)Temperature in Degree Fahrenheit: " + (int)Tf);
        System.out.println("(Decimal part)Temperature in Degree Fahrenheit: " + TF);
        scan.close();
    }
}