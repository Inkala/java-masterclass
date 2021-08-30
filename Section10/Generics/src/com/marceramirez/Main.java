package com.marceramirez;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
//
//        System.out.println(adelaideCrows.numPlayers());
//
//        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
//        chicagoCubs.addPlayer(pat);
//
//        Team<SoccerPlayer> soccerTeam = new Team<>("Real Madrid");
//        soccerTeam.addPlayer(beckham);
//
//        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
//        FootballPlayer banks = new FootballPlayer("Gordon");
//        melbourne.addPlayer(banks);
//
//        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
//        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//
//        hawthorn.matchResult(fremantle, 1, 0);
//        hawthorn.matchResult(adelaideCrows, 3, 8);
//
//        adelaideCrows.matchResult(fremantle, 2, 1);
////        adelaideCrows.matchResult(chicagoCubs, 1, 1);
//
//        System.out.println("Rankings");
//        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//
//        System.out.println(adelaideCrows.compareTo(melbourne));
//        System.out.println(adelaideCrows.compareTo(hawthorn));
//        System.out.println(hawthorn.compareTo(adelaideCrows));
//        System.out.println(melbourne.compareTo(fremantle));

        League<Team<FootballPlayer>> footballLeague = new League<>("`AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
        footballLeague.showLeagueTable();
    }
}
