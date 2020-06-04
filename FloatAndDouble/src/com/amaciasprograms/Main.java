package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {
        
        float minFloatVal = Float.MIN_VALUE;
        float maxFloatVal = Float.MAX_VALUE;
        System.out.println("Float min value = " + minFloatVal);
        System.out.println("Float max value = " + maxFloatVal);

        double minDoubleVal = Double.MIN_VALUE;
        double maxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double min value = " + minDoubleVal);
        System.out.println("Double max value = " + maxDoubleVal);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;

        double doubleValue = 5d / 3d; // Good practice to use d after in, but don't have to (i.e. 5.00 / 3.00).
        System.out.println("intValue= " + intValue);
        System.out.println("floatValue= " + floatValue);
        System.out.println("doubleValue= " + doubleValue);

    }
}
