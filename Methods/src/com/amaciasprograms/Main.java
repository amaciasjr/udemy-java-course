package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
        printScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        printScore(gameOver, score, levelCompleted, bonus);

        String player = "Johny";
        int playerScore = 1500;
        int position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Kelly";
        playerScore = 900;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Jared";
        playerScore = 400;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Emily";
        playerScore = 50;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Sarah";
        playerScore = 1000;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "David";
        playerScore = 500;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);

        player = "Steph";
        playerScore = 100;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(player, position);
    }

    public static void printScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);
    }

    // By having this method, the duplicate code has been reduced to one area. This allows for easier maintainability.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            return score + (levelCompleted * bonus);
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) { return 1; }
//        else if (playerScore >= 500) { return 2; }
//        else if (playerScore >= 100) { return 3; }
//        else { return 4; }
        
        // The following is an easier method to read.
        int position = 4; // Assuming position 4 will be returned
        if (playerScore >= 1000) { position = 1; }
        else if (playerScore >= 500) { position = 2; }
        else if (playerScore >= 100) { position = 3; }
        return position;
    }

}
