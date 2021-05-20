package com.marceramirez;

public class Main {

    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10) + " - " + false);
        System.out.println(PlayingCat.isCatPlaying(false, 36) + " - " + false);
        System.out.println(PlayingCat.isCatPlaying(false, 35) + " - " + true);
    }
}
