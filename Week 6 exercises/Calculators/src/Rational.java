public class Rational 
    {

        private int numerator;
        private int denominator;


        
        public Rational()
            {
                numerator = 0;
                denominator = 1;                
                
               

            } 



        
        public Rational(int n, int d)
        {

            if (d < 0)
                n = -n;

            else if (d == 0)
                d = 1;

            else 
                d = 0;
            
        }

public int getNumerator()
{
    return numerator;
}


public int getDenominator()
{
    return denominator;
}

public void setNumerator(int n)
{
    numerator = n;
}

public void setDenominator(int n, int d, int num, int denom) // FIX IT. ADD STATIC
{
    denominator = d;
    if (d < 0)
    {
        num = -n;
        denom = d;
    }

    else if (d == 0)
    {
        num = n;
        denom = 1;
    }

    else
    {
        num = n;
        denom = 0;
    }
}

public String toString()
{
    return numerator + "/" + denominator; 
}

public boolean equals (Rational other)
{
    if(numerator * other.denominator == denominator * other.numerator)
        return true;
    else 
        return false;
}

public boolean notEquals(Rational other)
{
    if (numerator * other.denominator != denominator * other.numerator)
        return true;
    else 
        return false;
}

public Rational reciprocal ()
{
   return new Rational (denominator, numerator);
}

//subtract method
public Rational subtract(Rational other)
{
    Rational temp = new Rational();
    temp.numerator = numerator * other.denominator - denominator * other.numerator;
    temp.denominator = denominator * other.denominator;
    return temp;
} 

//add method
public Rational add(Rational other)
{
    Rational temp = new Rational();
    temp.numerator = numerator * other.denominator + denominator * other.numerator;
    temp.denominator = denominator * other.denominator;
    return temp;
}

public Rational multiply (Rational op2)
{
   int numer = numerator * op2.getNumerator();
   int denom = denominator * op2.getDenominator();

   return new Rational (numer, denom);
}

public Rational divide (Rational op2)
{
   return multiply (op2.reciprocal());
}

public boolean lessThan(Rational other)
{
    return(numerator * other.denominator < denominator * other.numerator);
}

public boolean greaterThan(Rational other)
{
    return(numerator * other.denominator > denominator * other.numerator);
}

public boolean lessThanEqualTo(Rational other)
{
    return(numerator * other.denominator <= denominator * other.numerator);
}

public boolean greaterThanEqual(Rational other)
{
    return(numerator * other.denominator >= denominator * other.numerator);
}




}