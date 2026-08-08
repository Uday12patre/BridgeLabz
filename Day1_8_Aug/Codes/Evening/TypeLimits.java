public class TypeLimits
{
    // Fix: Use the wrapper classes to access constants
    int M = Integer.MAX_VALUE;
    int m = Integer.MIN_VALUE;

    byte B = Byte.MAX_VALUE + 1;
    byte b = Byte.MIN_VALUE;

    short S = Short.MAX_VALUE;
    short s = Short.MIN_VALUE;

    long L = Long.MAX_VALUE;
    long l = Long.MIN_VALUE;
        
    public void iLimit()
    {
        M = M + 1;
        System.out.println("Integer Overflow! " + M);

        m = m - 1;
        System.out.println("Integer Underflow! " + m);
    }

    public void bLimit()
    {
        // Fix: Explicitly cast to (byte) because int-addition implicitly promotes expressions
        B = B + (byte)(1);
        System.out.println("byte Overflow! " + B);

        b = b - (byte)(1);
        System.out.println("byte Underflow! " + b);
        System.out.println();
        
    }

    public void sLimit()
    {
        // Fix: Explicitly cast to (short) for the same reason
        S = S + (short)(1);
        System.out.println("short Overflow! " + S);

        s = s - (short)(1);
        System.out.println("short Underflow! " + s);
        System.out.println();
    }

    public void lLimit()
    {
        L = L + 1;
        System.out.println("long Overflow! " + L);

        l = l - 1;
        // Fix: Corrected typo from "Integer Underflow!" to "long Underflow!"
        System.out.println("long Underflow! " + l);
        
    }

    public static void main(String[] args)
    {
        TypeLimits T = new TypeLimits();
        T.iLimit();
        T.bLimit();
        T.sLimit();
        T.lLimit();
    }
}
