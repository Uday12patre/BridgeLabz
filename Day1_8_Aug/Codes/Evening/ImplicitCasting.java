public class ImplicitCasting
{
    public void Casting()
    {
        byte b = 65;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Initial byte: " + b);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: "+ d);
    }

    public static void main(String[] args)
    {
        ImplicitCasting I = new ImplicitCasting();

        I.Casting();
    }
}