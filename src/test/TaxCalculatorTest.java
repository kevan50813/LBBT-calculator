package test;

import StampDuty.House;
import StampDuty.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    House h1;
    House h2;
    House h3;
    House h4;
    House h5;
    House h6;
    TaxCalculator tc;

    @BeforeEach
    void setUp() {
        h1 = new House(125000);
        h2 = new House(250000);
        h3 = new House(925000);
        h4 = new House(1500000);
        h5 = new House(295000);
        h6 = new House(1500001);
        tc = new TaxCalculator();
    }

    @Test
    void calculateLBTT() throws Exception {
        assertEquals(tc.calculateLBTT(h5),4750,"The LBTT calculation dose not work correctly");
        assertEquals(tc.calculateLBTT(h1),0,"The LBTT calculation dose not work correctly");
        assertEquals(tc.calculateLBTT(h2),2500,"The LBTT calculation dose not work correctly");
        assertEquals(tc.calculateLBTT(h3),36250,"The LBTT calculation dose not work correctly");
    }

    @Test
    void calculateTax() {
        assertEquals(tc.calculateTax(1),0,"Tax Calualtor dosent work properly");
        assertEquals(tc.calculateTax(295000),4750,"Tax Calualtor dosent work properly");
    }
}