package Model;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private List<Media> savedContent = new ArrayList<>();
    private List<Media> listeningHistory = new ArrayList<>();

    public User(int userId, String name, String email, String password, List<Media> savedContent, List<Media> listeningHistory) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.savedContent = savedContent;
        this.listeningHistory = listeningHistory;
    }
    //GETTERS
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Media> getSavedContent() {
        return savedContent;
    }

    public List<Media> getListeningHistory() {
        return listeningHistory;
    }
    //SETTERS
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSavedContent(List<Media> savedContent) {
        this.savedContent = savedContent;
    }

    public void setListeningHistory(List<Media> listeningHistory) {
        this.listeningHistory = listeningHistory;
    }

    public void saveContent(Media media){

    }
    public void addToListeningHistory(Media media){

    }
}
