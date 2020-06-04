package com.amaciasprograms;

public class Main {

    private static final double KILOGRAM_PER_POUND = 0.45359237;

    private static double convertPoundsToKilograms(double pound) {
        return pound * KILOGRAM_PER_POUND;
    }

    public static void main(String[] args) {
        double pound = 200d;
        double kilogramValue = convertPoundsToKilograms(pound);

        System.out.println(pound + " pounds is equal to " + kilogramValue + " kilograms.");

    }
}
