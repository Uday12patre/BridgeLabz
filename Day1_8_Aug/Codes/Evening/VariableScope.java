public class VariableScope
{
    static int var = 6; // Static (Class) Variable
    int ch = 14; // Instance (Class) Variable
    public void displayMessages()
    {
        int a = 10; // Local Varible;

        System.out.println("Static variable: " + var);
        System.out.println("Local variable: " + a);
        System.out.println("Instance variable: " + ch);
    }

    public int add(int a, int b)
    {
        System.out.println("Static variable: " + var);
        return a + b;
    }

    public static void main(String[] args)
    {
        System.out.println("Direct Static variable: " + VariableScope.var);

        VariableScope obj = new VariableScope();

        System.out.println("Instance variable: " + obj.ch);
        obj.displayMessages();

        int sum = obj.add(5, 7);
        System.out.println("Sum: " + sum);
    }
}