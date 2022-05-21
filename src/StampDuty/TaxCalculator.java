package StampDuty;

/**
 * Handles all logic for tax calulation,
 * implrments TaxFactory to keep with the SOLID priciples
 */
public class TaxCalculator implements TaxFactory{

    public double calculateLBTT(House h) throws Exception {
        //decide weatehr to claate tax or not
        switch (h.getPriceBand()){
            // if band A (<=125000) there is no tax to pay
            case BAND_A:
                return 0.0;
            // anything else pays tax so call tge tax calculation
            case BAND_B:
            case BAND_E:
            case BAND_D:
            case BAND_C:
                return calculateTax(h.getPrice());

            //defualt should never be reached so thorw an exception if it ends up in there
            default:
                throw new Exception("COULD NOT ATTACH HOUSE TO A PRICE BAND");
        }
    }

    /* implemnt tax calution from infomation via https://www.gov.uk/stamp-duty-land-tax/residential-property-rates
        There are neaumerous factors that effect this calclauton but to make it as simple as possible:
        1) 0% tax on the first 125,000 (this case is ignored)
        2) 2% tax on the next 125,000 (or the remaideer if the amount dose not excede 250,000)
        3) 5% tax on the next 675,000 (or the remaideer if the amount dose not excede 925,000)
        4) 10% tax on the next 675,000 (or the remaideer if the amount dose not excede 1,500,000)
        5) 15% tax on the remaideer
         these vlaues are then summed and the tax is returned
     */
    @Override
    public double calculateTax(double price){
        double priceRemiader=price;
        double tax = 0.0;
        if(price <= 125000){
            return 0.0;
        }
        if(price > 125000 && price <= 250000){
            priceRemiader = priceRemiader  - 125000; // no tax paid on the first 125k

            //2% of the remiader , sicne it sonly in the 2nd tax bracket
            tax = tax + ((priceRemiader /100 ) * 2); //append value to total tax to be paid
        }

        if(price > 250000 && price <= 925000){
          priceRemiader = priceRemiader - 125000;   // no tax paid on the first 125k
            //2% of the next 125k
            tax = tax + ((125000 /100 ) * 2); //append value to total tax to be paid

            //5% of the remainder
           priceRemiader = priceRemiader - 125000;   //125k differnce into next bracket
            tax = tax + ((priceRemiader /100 ) * 5); //append value to total tax to be paid
        }

        if(price > 925000 && price <= 1500000){
          priceRemiader = priceRemiader - 125000;   // no tax paid on the first 125k
            //2% of the next 125k
            tax = tax + ((125000 /100 ) * 2); //append value to total tax to be paid

            //5% of the next 250k
          priceRemiader = priceRemiader - 125000;   //125k differnce into next bracket
            tax = tax + ((250000 /100 ) * 5); //append value to total tax to be paid

            //10% of the remaider
            priceRemiader = priceRemiader - 675000; //675k differnce into next bracket
            tax = tax + ((priceRemiader /100 ) * 10); //append value to total tax to be paid
        }

        if(price > 1500000){
          priceRemiader = priceRemiader - 125000;   // no tax paid on the first 125k
            //2% of the next 125k
            tax = tax + ((125000 /100 ) * 2); //append value to total tax to be paid

            //5% of the next 250k
          priceRemiader = priceRemiader - 125000;   //125k differnce into next bracket
            tax = tax + ((250000 /100 ) * 5); //append value to total tax to be paid

            //10% of the next 675k
            priceRemiader = priceRemiader - 675000; //675k differnce into next bracket
            tax = tax + ((675000 /100 ) * 10); //append value to total tax to be paid

            //12% of the remaing total
            priceRemiader = priceRemiader - 1500000; //1.5 million differnce into next bracket
            tax = tax + ((priceRemiader /100 ) * 12); //append value to total tax to be paid
        }

        return tax;
    }
}
