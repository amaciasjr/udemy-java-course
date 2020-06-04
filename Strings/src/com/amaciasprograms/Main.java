package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {

        // NOTE: Strings in Java are Immutable.

        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and there's more!";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString is equal to " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double myDouble = 12.43d;
        lastString = lastString + myDouble;
        System.out.println("lastString is equal to " + lastString);
    }
}
