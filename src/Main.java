import Model.*;
import Service.*;
public class Main {
    public static void main(String[] args) {
        AudioBook book = new AudioBook(
                "Harry Potter",
                "J.K. Rowling",
                3600,
                "Jim Dale",
                "Bloomsbury",
                1997
        );
        Song song = new Song(
                "Shape of You",
                "Ed Sheeran",
                240,
                "Ed Sheeran",
                "Divide",
                "Pop"
        );

        User user = new User(1, "Fidan", "fidan@example.com", "1234");

        AudioBookPlayer player = new AudioBookPlayer();
        // PLAY AUDIOBOOK
        player.setContent(book);
        player.play();
        player.pause();
        player.resume();
        player.stop();

        user.addToListeningHistory(book);
        user.saveContent(book);

        // PLAY SONG
        player.setContent(song);
        player.play();
        player.pause();
        player.resume();
        player.stop();

        user.addToListeningHistory(song);

        // SHOW USER DATA
        System.out.println("\nSaved Content:");
        for (Media m : user.getSavedContent()) {
            m.displayInfo();
        }
        System.out.println("\nListening History:");
        for (Media m : user.getListeningHistory()) {
            m.displayInfo();
        }
    }
}