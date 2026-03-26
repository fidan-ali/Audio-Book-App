public class AudioBook extends Media{
    public String narrator;
    public String publisher;
    public int release_year;

    public AudioBook(String title, String author, int length, String narrator, String publisher, int release_year) {
        super(title, author, length);
        this.narrator = narrator;
        this.publisher = publisher;
        this.release_year = release_year;
    }
}
