import java.util.Scanner;

public class SumOfTwoNumber
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Sum of " + a + " and " + b + " is " + (a+b));    
    }
}