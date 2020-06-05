package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        // This is valid, but not recommended. Other may accidentally try to add more code bases on the conditions, but
        // they may not notice there is no code block.
        if (score == 5000)
            System.out.println("Your score is 5000 - first time");

        // This better than the above if because the code block allows others to know when the if statement is complete.
        if (score == 5000) {
            System.out.println("Your score is 5000 - second check");
        }

        // If-else statement practice/notes
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 and greater than 1000");
//        }
//        else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // Note that `finalScore` variable cannot be accessed from outside its code block scope.

        // Challenge: Print out a second score on the screen with the following:
        // score set to 10000, levelCompleted set to 8, bonus set to 200, but make sure the above print out still displays.

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was " + finalScore);
        }
        // Even though the above solution works, duplicating code is a bad practice because duplicate code is hard to maintain.
    }
}
