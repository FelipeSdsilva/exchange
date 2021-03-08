package calulator;

public class CurrencyConverter {
 
    public static double dollar(double coin, double value)
    {
        return (value * coin)+((value * coin) * 0.06);
    }

}
