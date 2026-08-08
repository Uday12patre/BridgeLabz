import java.util.Scanner;

public class Swap
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("a = " + a + ", b = " + b);     
        
        int temp = a;
        a = b;
        b = temp;

        System.out.print(" | After Swapping : a = " + a + ", b = " + b);     
        
    }
}
