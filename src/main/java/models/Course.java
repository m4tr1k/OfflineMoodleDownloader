package models;

import java.io.Serializable;
import java.util.Set;

public class Course extends DBCollection<Section> implements Serializable {
    public Course() {}

    public Course(int id, String name, boolean download) {
        super(id, name, download);
    }

    // Rewritten methods to better represent the class
    public boolean addSection(Section s) {
        return addToCollection(s);
    }

    public boolean hasSection(Section s) {
        return hasInCollection(s);
    }

    public boolean removeSection(Section s) {
        return removeFromCollection(s);
    }
}
