package de.denphi.kuluzu.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Phil on 18.03.2016.
 */
public class Animal extends Sprite {
    private String name;
    private String category;
    private String tcolor;

    public Animal(Texture tex, int width, int height, String name, String category, String tcolor){
        super(tex, width, height);
        this.name=name;
        this.category=category;
        this.tcolor=tcolor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTcolor() {
        return tcolor;
    }

    public void setTcolor(String tcolor) {
        this.tcolor = tcolor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
