package Model;

/**
 * Created by UFO_24 on 17-02-2018.
 */

public class ListItem {

    private String title;
    private String description;

    private String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ListItem(String title, String description, String rating){

        this.title = title;
        this.description = description;
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
