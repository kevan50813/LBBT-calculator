package StampDuty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a house price: ");
		double price = reader.nextDouble();
	    House h = new House(price);
	    TaxCalculator tc = new TaxCalculator();
	    double tax=tc.calculateLBTT(h);
	    Stats s = new Stats(h,tax);
	    s.printStats();
    }
}
