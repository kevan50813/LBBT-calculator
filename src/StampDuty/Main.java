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
	    System.out.println("House Price: £"+String.format("%.2f",h.getPrice()));
	    System.out.println("House Tax Band: "+h.getPriceBand());
	    System.out.println("Total Tax To be paid: £"+String.format("%.2f",tax));
    }
}
