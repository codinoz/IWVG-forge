package es.upm.miw.iwvg.ecosystem.junit;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {

    private Fraction fraction;

    @Test
    void testDecimalIfIntegerDivision(){
        fraction = new Fraction(5,2);
        assertEquals(2.5,fraction.decimal());
    }

    @Test
    void testDecimalIfDivisionByZero(){
        fraction = new Fraction(5,0);
        assertTrue(Double.isInfinite(fraction.decimal()));
        fraction = new Fraction(0,0);
        assertTrue(Double.isNaN(fraction.decimal()));
    }

    @Test
    void testDecimal(){
        fraction = new Fraction(0,2);
        assertEquals(0, fraction.decimal());

        fraction = new Fraction(2,8);
        assertEquals(0.25, fraction.decimal());

        fraction = new Fraction(8, 2);
        assertEquals(4, fraction.decimal());

        fraction = new Fraction();
        assertEquals(1, fraction.decimal());
    }
}
