package com.marceramirez;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love Don't Mean a Thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold On", 5.6);
        album.addSong("Lady Double Dealer", 3.21);
        album.addSong("You Can't Do It Right", 6.23);
        album.addSong("High Ball Shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of Fortune", 3.13);
        albums.add(album);

        album = new Album("For Those About to Rock", "AC/DC");
        album.addSong("For Those About to Rock (We Salute You)", 5.44);
        album.addSong("I Put the Finger on You", 3.25);
        album.addSong("Let's Get It Up", 3.45);
        album.addSong("Inject the Venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil Walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the Rules", 5.32);
        album.addSong("Night of the Long Knives", 5.12);
        album.addSong("Spellbound", 4.46);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("You Can't Do It Right", playList);
        albums.get(0).addToPlaylist("Holy Man", playList);
        albums.get(0).addToPlaylist("Speed King", playList);
        albums.get(0).addToPlaylist(9, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(8, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(23, playList);
        
        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
    }

}


// Create a program that implements a playlist for songs
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listIterator.remove()