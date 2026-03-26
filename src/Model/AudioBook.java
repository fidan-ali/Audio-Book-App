package Model;

import Interfaces.AudioContent;
import Interfaces.MusicContent;

public class AudioBook extends Media implements AudioContent{
    public String narrator;
    public String publisher;
    public int release_year;

    public AudioBook(String title, String author, int length, String narrator, String publisher, int release_year) {
        super(title, author, length);
        this.narrator = narrator;
        this.publisher = publisher;
        this.release_year = release_year;
    }

    @Override
    public void play(float speed) {
        System.out.println("Playing audiobook at speed " + speed);
    }
    @Override
    public void pause() {
        System.out.println("AudioBook paused");
    }
    @Override
    public void resume() {
        System.out.println("AudioBook resumed");
    }
    @Override
    public void stop() {
        System.out.println("AudioBook stopped");
    }

    @Override
    public void displayInfo() {
        System.out.println(title + " by " + author + ", narrated by " + narrator);
    }
}
