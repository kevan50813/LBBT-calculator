package StampDuty;

// used by the tax calculator, used to calculate tax
public interface TaxFactory {
    public abstract double calculateTax(double price);
}
