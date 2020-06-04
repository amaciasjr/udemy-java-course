package com.amaciasprograms;

public class Main {
    private static final double MILES_PER_KILOMETER = 0.621371;

    public static void main(String[] args) {
        double kilometers = 103_340;
        double milesConversion = convertKilometersToMiles(kilometers);

        System.out.println(kilometers + " kilometers is equal to " + milesConversion + " miles.");
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers * MILES_PER_KILOMETER;
    }
}
