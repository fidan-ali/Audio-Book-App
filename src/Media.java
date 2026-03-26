import com.sun.jdi.connect.Connector;

public abstract class Media {
    public String title;
    public String author;
    public int length;

    public Media(String title, String author, int length) {
        this.title = title;
        this.author = author;
        this.length = length;
    }
}
