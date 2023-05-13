package Model;

import java.io.Serializable;

public class Story implements Serializable {
    private String title;
    private String desc;
    private int image ;

    private Scene[] scenes;

    public Story(String title, String desc, int image,Scene[] scenes) {
        this.title = title;
        this.desc = desc;
        this.image = image;
        this.scenes = scenes;
}

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
