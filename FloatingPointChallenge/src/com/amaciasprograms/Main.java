package com.amaciasprograms;

public class Main {

    private static final double KILOGRAM = 0.45359237;

    public static void main(String[] args) {
        int pound = 10;
        double kilogramValue = convertPoundsToKilograms(pound);

        System.out.println(pound + " pounds is equal to " + kilogramValue + " kilograms.");


    }

    private static double convertPoundsToKilograms(int pound) {
        return pound / KILOGRAM;
    }


}
