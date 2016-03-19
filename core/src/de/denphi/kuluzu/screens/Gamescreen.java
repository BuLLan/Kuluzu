package de.denphi.kuluzu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import de.denphi.kuluzu.Kuluzu;
import de.denphi.kuluzu.manager.Resourcenmanager;

/**
 * Created by Phil on 18.03.2016.
 */
public class Gamescreen implements Screen {
    SpriteBatch batch;
    Texture img;
    Resourcenmanager rm = Resourcenmanager.getInstance();

    public static float enclosureBegin;
    public static float enclosureEnd;

    public static float dropMaxHigh;
    public static float animalSize;

    @Override
    public void show() {

        enclosureBegin = (float) (Kuluzu.displayheight*0.45);
        enclosureEnd = (float) (Kuluzu.displayheight*0.9);
        animalSize = (float) (enclosureBegin*0.3);
        dropMaxHigh = enclosureEnd-animalSize;


        batch = new SpriteBatch();
        img = new Texture("ui/background.png");


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0, Kuluzu.displaywidth, Kuluzu.displayheight);
        batch.draw(rm.getTexture("sheepred"), 80, enclosureBegin, animalSize, animalSize);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        System.out.println("close-----------------------");
    }
}
