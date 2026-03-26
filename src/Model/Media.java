package Model;

public abstract class Media {
    protected String title;
    protected String author;
    protected int length;

    public Media(String title, String author, int length) {
        this.title = title;
        this.author = author;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getLength() {
        return length;
    }

    public abstract void displayInfo();
}
