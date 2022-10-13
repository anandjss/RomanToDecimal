import static org.junit.Assert.*;

/**
 * Junit test for RomanToDecimal
 */
public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14); // valid
        assertEquals(RomanToDecimal.romanToDecimal("hi mom"), -1); // invalid
        assertEquals(RomanToDecimal.romanToDecimal("IVIVIV"),16); // logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("XII"),12); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CMX"),910); // valid
        assertEquals(RomanToDecimal.romanToDecimal("IXIXIX"),31); // logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("HOWIX"),-1); // invalid
        assertEquals(RomanToDecimal.romanToDecimal("CML"), 950); // valid
        assertEquals(RomanToDecimal.romanToDecimal("MDCIX"),1609); // valid
        assertEquals(RomanToDecimal.romanToDecimal("I"),1); // valid
        assertEquals(RomanToDecimal.romanToDecimal("IXI"),10); // logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("MIXI"),1010); // logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("MMMDC"),3600); // valid
        assertEquals(RomanToDecimal.romanToDecimal("CMXX"),920); // valid
        assertEquals(RomanToDecimal.romanToDecimal("DCC"),700); //valid
        assertEquals(RomanToDecimal.romanToDecimal("CL"),150); //valid
        assertEquals(RomanToDecimal.romanToDecimal("HUTCHISSTINKY"),-1); //invalid
        assertEquals(RomanToDecimal.romanToDecimal("IHATETESTING"), -1); //invalid


    }
}