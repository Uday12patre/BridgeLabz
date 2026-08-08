import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        int c = 0;
        int s = 0;

        if(n == 1)
        {
             System.out.println("Sum of 1 Fibonacci number is 0");
        }
        else if(n == 2)
        {
            System.out.println("Sum of 2 Fibonacci number is 1");
        }

        else 
        {
            for(int i = 0; i < n; i++)
            {
                b = a+b;
                a = b;
                s = a + b;
            }

            System.out.println("Sum of " + n + " Fibonacci Numbers is " + s);     
        }
    }
}