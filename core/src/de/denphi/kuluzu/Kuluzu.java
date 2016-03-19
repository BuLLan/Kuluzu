package de.denphi.kuluzu;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import de.denphi.kuluzu.game.Round;
import de.denphi.kuluzu.screens.Gamescreen;

public class Kuluzu extends Game {


	//Arrays with all colors and animals for a random use
	public static Array<String> colorArray = new Array<String>();//  {"white", "yellow", "rosa", "orange", "red", "lila", "green", "grey", "black", "brown"};
	public static Array<String> animalArray = new Array<String>();
	public static float displayheight;
	public static float displaywidth;

	@Override
	public void create () {

		displayheight= (float) Gdx.graphics.getHeight();
		displaywidth = (float) Gdx.graphics.getWidth();

		colorArray.addAll("white", "yellow", "rosa", "orange", "red", "lila", "green", "grey", "black", "brown");
		animalArray.addAll("sheep","duck", "pig", "fox", "bear","squirrel","hippo", "crocodile", "elephant","monkey");
		Round r = new Round(4,8, new Texture("badlogic.jpg") );
		r.createAnimals();
		r.createDisjunctAnwers(4);
		setScreen(new Gamescreen());

	}

	@Override
	public void render () {
		super.render();
	}
}
