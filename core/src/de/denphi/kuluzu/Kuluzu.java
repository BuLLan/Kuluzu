package de.denphi.kuluzu;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.denphi.kuluzu.screens.Gamescreen;

public class Kuluzu extends Game {
	@Override
	public void create () {
		setScreen(new Gamescreen());
	}

	@Override
	public void render () {
		super.render();
	}
}
