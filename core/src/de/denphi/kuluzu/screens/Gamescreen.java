package de.denphi.kuluzu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import de.denphi.kuluzu.game.Level;

/**
 * Created by Phil on 18.03.2016.
 */
public class Gamescreen implements Screen {
    SpriteBatch batch;
    Texture img;
    ShapeRenderer shapeRenderer;

    @Override
    public void show() {
        batch = new SpriteBatch();
        img = new Texture("testbild.png");
        Level l = new Level(4,8, new Texture("badlogic.jpg") );
        l.createAnimals();
        l.createAnwers();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.rect(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight() * (float) 0.45);
        shapeRenderer.rect(0, Gdx.graphics.getHeight()*(float) 0.45, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()*(float) 0.45);

        shapeRenderer.end();
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

    }
}
