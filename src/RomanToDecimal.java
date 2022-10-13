/**
 * RomanToDecimal converts roman numerals into decimals and discards invalid inputs
 * @version 10/13/22
 * @author 24jayashankar
 */
public class RomanToDecimal {

    /**
     * Converts roman numerals to decimals using if statements and for loops
     * @param roman epresents a string of roman numerals
     * @return a decimal value
     */
    public static int romanToDecimal(String roman)  {
        int sum = 0;
        // convert to all one case
        roman = roman.toUpperCase();
        // "XI".length() = 2
        // "MCMLXII".length() = 7
        // "HAHA" ==> -1
        // "xliv"
        //  0123456
        // len(roman) is Python
        // string.length()
        // array.length
        // list.size()
        for(int i = 0; i < roman.length(); i++) {       // driven by a counter variable
            if (roman.charAt(i) == 'I')
                sum += 1;
            else if (roman.charAt(i) == 'V')
                sum += 5;
            else if (roman.charAt(i) == 'X')
                sum += 10;
            else if (roman.charAt(i) == 'L')
                sum += 50;
            else if (roman.charAt(i) == 'C')
                sum += 100;
            else if (roman.charAt(i) == 'D')
                sum += 500;
            else if (roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;


        }
        // INVARIANTS
        if(roman.indexOf("IV") != -1)
            sum -= 2;
        if(roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1)
            sum -= 20;
        if(roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1)
            sum -= 200;
        if(roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }

    private static String decimalToRoman(int decimal)   {
        String roman = "";
        while (decimal >= 1000) {
            // is there 1000 in the number?
            roman += "M";
            decimal -= 1000;

        }
        while (decimal >= 900) {
            // is there 900 in the number?
            roman += "CM";
            decimal -= 900;

        } while (decimal >= 500) {
            // is there 500 in the number?
            roman += "D";
            decimal -= 500;

        } while (decimal >= 400) {
            // is there 400 in the number?
            roman += "CD";
            decimal -= 400;

        } while (decimal >= 100) {
            // is there 100 in the number?
            roman += "C";
            decimal -= 100;

        } while (decimal >= 90) {
            // is there 90 in the number?
            roman += "XC";
            decimal -= 90;

        } while (decimal >= 50) {
            // is there 50 in the number?
            roman += "L";
            decimal -= 50;

        } while (decimal >= 40) {
            // is there 40 in the number?
            roman += "XL";
            decimal -= 40;

        } while (decimal >= 10) {
            // is there 10 in the number?
            roman += "X";
            decimal -= 10;

        } while (decimal >= 9) {
            // is there 9 in the number?
            roman += "IX";
            decimal -= 9;

        } while (decimal >= 5) {
            // is there 5 in the number?
            roman += "V";
            decimal -= 5;

        }
        while (decimal >= 4) {
            // is there 4 in the number?
            roman += "IV";
            decimal -= 4;

        }
        while (decimal >= 1) {
            // is there 1 in the number?
            roman += "I";
            decimal -= 1;

        }
        return roman;
    }

    /**
     * Main method for class RomanToDecimal
     * @param args Command-line arguments, if needed
     */

    public static void main(String[] args) {
        for(String roman: args) {       // for-each loop
            int decimal = romanToDecimal(roman);
            if(decimal == -1)
                System.out.println("Input: " + roman + "=> output: invalid");
            else if(roman.toUpperCase().equals(decimalToRoman(decimal)))
                System.out.println("Input: " + roman + "=> output: " + romanToDecimal(roman) );
            else
                System.out.println("Input: " + roman + "=> output: Not logical ");

        }
    }
}
