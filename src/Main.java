public class Main {

    public static void main(String[] args) {
	    House h = new House(295000);
	    TaxCalculator tc = new TaxCalculator();
	    double tax=tc.calculateTax(h.getPrice());

	    System.out.println("Total Tax To be paid: £"+tax );
    }
}
