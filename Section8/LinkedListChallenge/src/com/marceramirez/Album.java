package com.marceramirez;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : this.songs) {
            if (song.getTitle()
                    .equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist) {
        boolean validTrackNo = ((trackNo - 1) < this.songs.size()) && trackNo > 0;
        if (validTrackNo) {
            Song song = this.songs.get(trackNo - 1);
            if (song != null) {
                return addToPlayList(song.getTitle(), playlist);
            }
        }
        System.out.println("This album doesn't have a track " + trackNo);
        return false;
    }
}
