package Model;

import Interfaces.MusicContent;

public class Song extends Media implements MusicContent {
    public String artist;
    public String album;
    public String genre;

    public Song(String title, String author, int length, String artist, String album, String genre) {
        super(title, author, length);
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }
    @Override
    public void play(float speed) {
        System.out.println("Playing song at speed " + speed);
    }
    @Override
    public void pause() {
        System.out.println("Song paused");
    }
    @Override
    public void resume() {
        System.out.println("Song resumed");
    }
    @Override
    public void stop() {
        System.out.println("Song stopped");
    }
    @Override
    public void displayInfo() {
        System.out.println(title + " by " + artist + " from album " + album);
    }
}
