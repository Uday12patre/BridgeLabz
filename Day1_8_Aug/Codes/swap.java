import java.util.Scanner;

public class swap
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.prString("Enter a: ");
        String a = scanner.next();

        System.out.prString("Enter b: ");
        String b = scanner.next();

        System.out.prString("a = " + a + ", b = " + b);     
        
        String temp = a;
        a = b;
        b = temp;

        System.out.prString(" | After Swapping : a = " + a + ", b = " + b);     
        
    }
}