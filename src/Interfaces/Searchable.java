package Interfaces;

import Model.Media;

public interface Searchable {
    Media searchByTitle(String keyword);
    Media searchByAuthor(String keyword);
}
