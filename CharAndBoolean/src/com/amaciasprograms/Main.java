package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {

        // char only stores one character. String stores multiple characters. Chars are also stored in 16 bits or 2 byte.
        char myChar = 'D';
        char unicodeChar = '\u0044';

        System.out.println("myChar = " + myChar + ". unicodeChar = " + unicodeChar);

        char copyrightChar = '\u00A9';
        System.out.println(copyrightChar);

        // Boolean Notes:
        boolean myTrueBooleanVal = true;
        boolean myFalseBooleanVal = false;

        boolean isCustomerOverTwentyOne = true; // Most boolean variable names in Java start with `is...`
    }
}
