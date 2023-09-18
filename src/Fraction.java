
public class Fraction
{
    public int numerator;
    public int denominator;

    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int a, int b)
    {
        numerator = a;
        if (b != 0) denominator = b;
        else b = 1;
        Check();
    }

    public void Show()
    {
        System.out.println(numerator + "/" + denominator);
    }

    public void Check()
    {
        if (numerator < 0 && denominator < 0)
        {
            numerator = -numerator;
            denominator = -denominator;
        }
        if (numerator == denominator)
        {
            numerator = 1;
            denominator = 1;
            return;
        }
        for (int i = Math.min(Math.abs(numerator), Math.abs(denominator)); i > 1; i++)
        {
            if ((numerator % i == 0) && (denominator % i == 0))
            {
                numerator /= i;
                denominator /= i;
                return;
            }
        }
    }
    Fraction Subtraction(Fraction fraction)
    {
        numerator *= fraction.denominator;
        numerator -= fraction.numerator * denominator;
        denominator *= fraction.denominator;
        Check();
        return this;
    }

    Fraction Multiplication(Fraction fraction)
    {
        numerator *= fraction.numerator;
        denominator *= fraction.denominator;
        Check();
        return this;
    }

    Fraction Division(Fraction fraction)
    {
        numerator *= fraction.denominator;
        denominator *= fraction.numerator;
        Check();
        return this;
    }
}
