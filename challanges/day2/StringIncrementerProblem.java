package challanges.day2;

import java.math.BigInteger;

public class StringIncrementerProblem {
    //Your job is to write a function which increments a string, to create a new string.
    //If the string already ends with a number, the number should be incremented by 1.
    //If the string does not end with a number. the number 1 should be appended to the new string.
    //Examples:
    //foo -> foo1
    //foobar23 -> foobar24
    //foo0042 -> foo0043
    //foo9 -> foo10
    //foo099 -> foo100
    //Attention: If the number has leading zeros the amount of digits should be considered.
    public static void main(String[] args) {
        System.out.println(increment(":.Gu}Kyv)M@|@W_OAur{9v6%ArM)Nl2199689883608632273894563118"));
    }

    public static String increment(String str) {
        int i = str.length() - 1;
        while (i >= 0 && Character.isDigit(str.charAt(i))) {
            i--;
        }
        if (i == str.length() - 1) {
            return str + "1";
        }
        String numericPart = str.substring(i + 1);
        String textPart = str.substring(0, i + 1);

        BigInteger number = new BigInteger(numericPart);
        BigInteger newNumber = number.add(BigInteger.ONE);

        String format = "%0" + numericPart.length() + "d";
        String newNumericPart = String.format(format, newNumber);
        return textPart + newNumericPart;
    }
}
