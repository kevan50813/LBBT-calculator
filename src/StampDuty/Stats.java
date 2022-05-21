package StampDuty;

/**
 * Class for printing all HouseStats
 */
public class Stats implements StatsFactory{

    private House h;
    private double tax;
    public Stats(House h,double tax){
        this.h = h;
        this.tax=tax;
    }

    @Override
    public void printStats() {
        System.out.println("House Price: £"+String.format("%.2f",h.getPrice()));
        System.out.println("House Tax Band: "+h.getPriceBand());
        System.out.println("Total Tax To be paid: £"+String.format("%.2f",tax));
    }
}
