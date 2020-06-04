package com.amaciasprograms;

public class Main {

    private static final double KILOGRAM_PER_POUND = 0.45359237;
    private static final double MILES_PER_KILOMETER = 0.621371;

    public static void main(String[] args) {
        int pound = 10;
        double kilogramValue = convertPoundsToKilograms(pound);

        System.out.println(pound + " pounds is equal to " + kilogramValue + " kilograms.");


        double milesConversion = convertKilometersToMiles();

    }

    private static double convertPoundsToKilograms(int pound) {
        return pound / KILOGRAM_PER_POUND;
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers * MILES_PER_KILOMETER;
    }


}
