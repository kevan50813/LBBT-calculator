package test;

import StampDuty.House;
import StampDuty.PriceBand;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    House h1;
    House h2;
    House h3;
    House h4;
    House h5;
    House h6;

    @BeforeEach
    void setUp() {
         h1 = new House(125000);
         h2 = new House(250000);
         h3 = new House(925000);
         h4 = new House(1500000);
         h5 = new House(295000);
         h6 = new House(1500001);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Testing GetPrice method")
    void testGetPrice() {
        assertEquals(h1.getPrice(),125000,"Getting prices should work");
        assertEquals(h2.getPrice(),250000,"Getting prices should work");
        assertEquals(h3.getPrice(),925000,"Getting prices should work");
        assertEquals(h4.getPrice(),1500000,"Getting prices should work");
        assertEquals(h5.getPrice(),295000,"Getting prices should work");
        assertEquals(h6.getPrice(),1500001,"Getting prices should work");
    }

    @Test
    @DisplayName("Testing GetPriceBand method")
    void testGetPriceBand() {
        assertEquals(h1.getPriceBand(), PriceBand.BAND_A,"The price band is wrong");
        assertEquals(h2.getPriceBand(), PriceBand.BAND_B,"The price band is wrong");
        assertEquals(h3.getPriceBand(), PriceBand.BAND_C,"The price band is wrong");
        assertEquals(h4.getPriceBand(), PriceBand.BAND_D,"The price band is wrong");
        assertEquals(h5.getPriceBand(), PriceBand.BAND_C,"The price band is wrong");
        assertEquals(h6.getPriceBand(), PriceBand.BAND_E,"The price band is wrong");
    }

}