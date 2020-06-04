package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {

        byte challengeByte = 124;

        short challengeShort = 30_000;

        int challengeInt = 60_000;

        long challengeLong = 50_000L + 10L * (challengeByte + challengeShort + challengeInt);

        System.out.println("challengeLong = " + challengeLong);


    }
}
