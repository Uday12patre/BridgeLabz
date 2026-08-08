import java.util.Scanner;

public class Operators
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.println();    
        System.out.println("a++ == " + (a++));  // First Prints then incremement 
        System.out.println("++a == " + (++a));    
        System.out.println("a-- == " + (a--));    
        System.out.println("--a == " + (--a));    
        System.out.println("a=+b == " + (a=+b));    
        System.out.println("a+=b == " + (a+=b));    
        System.out.println("a=-b == " + (a=-b));    
        System.out.println("a-=b == " + (a-=b));    
            
    }
}