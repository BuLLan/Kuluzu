package de.denphi.kuluzu.manager;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

import de.denphi.kuluzu.Kuluzu;

/**
 * Created by Phil on 19.03.2016.
 */
public class Resourcenmanager {

    private Map<String, Texture> textureMap = new HashMap<String, Texture>();

    private static Resourcenmanager ourInstance = new Resourcenmanager();

    public static Resourcenmanager getInstance() {
        return ourInstance;
    }

    private Resourcenmanager() {
        for (int i=0; i<Kuluzu.animalArray.size;i++){
            for (int j=0; j<Kuluzu.colorArray.size; j++){
                textureMap.put(Kuluzu.animalArray.get(i) + Kuluzu.colorArray.get(j), new Texture("animals/"+Kuluzu.animalArray.get(i) + "_" + Kuluzu.colorArray.get(j)+".png"));
            }
        }
    }
    public Texture getTexture(String name){
        return textureMap.get(name);
    }

    public int getMap(){
        return textureMap.size();
    }
}