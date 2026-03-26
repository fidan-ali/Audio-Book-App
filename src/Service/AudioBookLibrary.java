package Service;

import Interfaces.Searchable;
import Model.*;

import java.util.ArrayList;
import java.util.List;

public class AudioBookLibrary implements Searchable {
    List<Media> mediaList = new ArrayList<>();
    public void addMedia(Media media){
        mediaList.add(media);
    }
    public void removeMedia(Media media){
        mediaList.remove(media);
    }

    @Override
    public Media searchByTitle(String keyword){
        for(Media media : mediaList){
            if(media.getTitle().contains(keyword)){
                return media;
            }
        }
        return null;
    }

   @Override
    public Media searchByAuthor(String keyword){
        for(Media media : mediaList){
            if(media.getAuthor().contains(keyword)){
                return media;
            }
        }
        return  null;
   }



}
