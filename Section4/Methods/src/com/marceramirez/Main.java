package com.marceramirez;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + finalScore);

        int position = calculateHighScorePosition(1500);
        displayHighScoreSolution("Marce", position);
        position = calculateHighScorePosition(900);
        displayHighScoreSolution("Alex", position);
        position = calculateHighScorePosition(400);
        displayHighScoreSolution("Nata", position);
        position = calculateHighScorePosition(50);
        displayHighScoreSolution("Andre", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScoreSolution(String player, int position) {
        System.out.println(player + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }
        return position;

    }
}
