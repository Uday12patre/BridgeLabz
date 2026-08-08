import java.util.Scanner;

public class ArithmeticOps
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();


        System.out.println();    
        System.out.println("Sum: " + a + " + " + b + " = " + (a+b));    
        System.out.println("Difference: " + a + " - " + b + " = " + (a-b));    
        System.out.println("Product: " + a + " * " + b + " = " + (a*b));    
        System.out.println("Quotient: " + a + " / " + b + " = " + (a/b));        
        System.out.println("Remainder: " + a + " % " + b + " = " + (a%b));    
    }
}