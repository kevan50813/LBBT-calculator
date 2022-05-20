public class House {
    private double price;
    private PriceBand priceBand;

    public House(double price){
        this.price=price;
        if(price <=125000){
            this.priceBand = PriceBand.BAND_A;
        }

        if(price >=125001 && price <= 250000){
            this.priceBand = PriceBand.BAND_B;
        }

        if(price >=250001 && price <= 925000){
            this.priceBand = PriceBand.BAND_C;
        }

        if(price >= 925001 && price <=150000){
            this.priceBand = PriceBand.BAND_D;
        }

        if(price >= 150001){
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
