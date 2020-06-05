package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {
        // List of Java Keywords: https://en.wikipedia.org/wiki/List_of_Java_keywords

        // a mile is equal to 1.609344 kilometers
        double miles = 100.00d;
        double kilometers = (miles * 1.609344);

        System.out.println(miles + " miles equals " + kilometers + " kilometers.");

        // Expressions Challenge
        int score = 100; // "score = 100" is an expression.
        if (score > 90) { // "score > 90" is an expression.
            System.out.println("Got High Score"); // "Got High Score" is an expression.
            score = 0; // "score = 0" is an expression.
        }
    }
}
