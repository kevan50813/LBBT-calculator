package StampDuty;

/**
 * This class handles all the things related to the house such as
 * detmieneing what pirce band it falls within
 */
public class House {
    private double price;
    private PriceBand priceBand;

    //set up house price and detrmines what price band it is in
    public House(double price){
        this.price=price;
        if(price < 0){
            throw new IllegalArgumentException("Price is negative: it should be posative");
        }
        if(price <=125000){
            this.priceBand = PriceBand.BAND_A;
        }

        if(price >=125001 && price <= 250000){
            this.priceBand = PriceBand.BAND_B;
        }

        if(price >=250001 && price <= 925000){
            this.priceBand = PriceBand.BAND_C;
        }

        if(price >= 925001 && price <= 1500000){
            this.priceBand = PriceBand.BAND_D;
        }

        if(price >= 1500001){
            this.priceBand = PriceBand.BAND_E;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PriceBand getPriceBand() {
        return priceBand;
    }

    public void setPriceBand(PriceBand priceBand) {
        this.priceBand = priceBand;
    }

}
