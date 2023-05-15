package Model;

import java.io.Serializable;

public class Scene implements Serializable {

    String scene_title;
    String context;
    int scene_image;



    public Scene(String scene_title, String context, int scene_image){
        this.scene_title = scene_title;
        this.context = context;
        this.scene_image = scene_image;
    }

    public String getScene_title() {
        return scene_title;
    }

    public String getContext() {
        return context;
    }

    public int getScene_image() {
        return scene_image;
    }

    public void setScene_title(String scene_title) {
        this.scene_title = scene_title;
    }

    public void setContext(String context) {
        this.context = context;
    }




    public void setScene_image(int scene_image) {
        this.scene_image = scene_image;
    }
}
