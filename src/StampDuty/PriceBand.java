package StampDuty;

//enum for price bands
//information form https://www.gov.uk/stamp-duty-land-tax/residential-property-rates
public enum PriceBand {
    BAND_A, // <= 125k
    BAND_B, // 125,001 - 250k
    BAND_C, // 250,001 - 925k
    BAND_D, // 925,001 - 1.5 million
    BAND_E  // > 1.5 million
}
