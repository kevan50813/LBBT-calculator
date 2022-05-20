public class Main {

    public static void main(String[] args) throws Exception {
	    House h = new House(295000);
	    TaxCalculator tc = new TaxCalculator();
	    double tax=tc.calculateLBTT(h);

	    System.out.println("House Price: "+h.getPrice());
	    System.out.println("House Tax Band: "+h.getPriceBand());
	    System.out.println("Total Tax To be paid: £"+tax );
    }
}
