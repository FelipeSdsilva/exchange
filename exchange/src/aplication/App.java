package aplication;

import java.util.*;
import calulator.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("What is the dollar price? ");
        double doll = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double value = sc.nextDouble();
        double real = CurrencyConverter.dollar(doll, value);
        System.out.printf("Amount to be paind in reais = %.2f%n", real);
    
        sc.close();
    }
}
