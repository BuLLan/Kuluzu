package de.denphi.kuluzu;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.denphi.kuluzu.screens.Gamescreen;

public class Kuluzu extends Game {

	/*
	public static Texture sheep_white, duck_white, pig_white, fox_white, bear_white, squirrel_white,  hippo_white, crocodile_white, elephant_white, monkey_white;
	public static Texture sheep_yellow, duck_yellow, pig_yellow, fox_yellow, bear_yellow, squirrel_yellow,  hippo_yellow, crocodile_yellow, elephant_yellow, monkey_yellow;
	public static Texture sheep_rosa, duck_rosa, pig_rosa, fox_rosa, bear_rosa, squirrel_rosa,  hippo_rosa, crocodile_rosa, elephant_rosa, monkey_rosa;
	public static Texture sheep_red, duck_red, pig_red, fox_red, bear_red, squirrel_red,  hippo_red, crocodile_red, elephant_red, monkey_red;
	public static Texture sheep_brown, duck_brown, pig_brown, fox_brown, bear_brown, squirrel_brown,  hippo_brown, crocodile_brown, elephant_brown, monkey_brown;
	public static Texture sheep_orange, duck_orange, pig_orange, fox_orange, bear_orange, squirrel_orange,  hippo_orange, crocodile_orange, elephant_orange, monkey_orange;
	public static Texture sheep_lila, duck_lila, pig_lila, fox_lila, bear_lila, squirrel_lila,  hippo_lila, crocodile_lila, elephant_lila, monkey_lila;
	public static Texture sheep_green, duck_green, pig_green, fox_green, bear_green, squirrel_green,  hippo_green, crocodile_green, elephant_green, monkey_green;
	public static Texture sheep_grey, duck_grey, pig_grey, fox_grey, bear_grey, squirrel_grey,  hippo_grey, crocodile_grey, elephant_grey, monkey_grey;
	public static Texture sheep_black, duck_black, pig_black, fox_black, bear_black, squirrel_black,  hippo_black, crocodile_black, elephant_black, monkey_black;
*/
	@Override
	public void create () {
		setScreen(new Gamescreen());

	/*
		//Animals white
		sheep_white = 	new Texture("sheep_white.jpg");
		duck_white = 	new Texture("duck_white.jpg");
		pig_white = 	new Texture("pig_white.jpg");
		fox_white = 	new Texture("fox_white.jpg");
		bear_white = 	new Texture("bear_white.jpg");
		squirrel_white =new Texture("squirrel_white.jpg");
		hippo_white= 	new Texture("hippo_white.jpg");
		crocodile_white=new Texture("crocodile_white.jpg");
		elephant_white =new Texture("elephant_white.jpg");
		monkey_white =	new Texture("monkey_white.jpg");

		//Animals black
		sheep_black = 	new Texture("sheep_black.jpg");
		duck_black = 	new Texture("duck_black.jpg");
		pig_black = 	new Texture("pig_black.jpg");
		fox_black = 	new Texture("fox_black.jpg");
		bear_black = 	new Texture("bear_black.jpg");
		squirrel_black =new Texture("squirrel_black.jpg");
		hippo_black= 	new Texture("hippo_black.jpg");
		crocodile_black=new Texture("crocodile_black.jpg");
		elephant_black =new Texture("elephant_black.jpg");
		monkey_black =	new Texture("monkey_black.jpg");

		//Animals grey
		sheep_grey = 	new Texture("sheep_grey.jpg");
		duck_grey = 	new Texture("duck_grey.jpg");
		pig_grey = 	new Texture("pig_grey.jpg");
		fox_grey = 	new Texture("fox_grey.jpg");
		bear_grey = 	new Texture("bear_grey.jpg");
		squirrel_grey =new Texture("squirrel_grey.jpg");
		hippo_grey= 	new Texture("hippo_grey.jpg");
		crocodile_grey=new Texture("crocodile_grey.jpg");
		elephant_grey =new Texture("elephant_grey.jpg");
		monkey_grey =	new Texture("monkey_grey.jpg");

		//Animals green
		sheep_green = 	new Texture("sheep_green.jpg");
		duck_green = 	new Texture("duck_green.jpg");
		pig_green = 	new Texture("pig_green.jpg");
		fox_green = 	new Texture("fox_green.jpg");
		bear_green = 	new Texture("bear_green.jpg");
		squirrel_green =new Texture("squirrel_green.jpg");
		hippo_green= 	new Texture("hippo_green.jpg");
		crocodile_green=new Texture("crocodile_green.jpg");
		elephant_green =new Texture("elephant_green.jpg");
		monkey_green =	new Texture("monkey_green.jpg");

		//Animals lila
		sheep_lila = 	new Texture("sheep_lila.jpg");
		duck_lila = 	new Texture("duck_lila.jpg");
		pig_lila = 	new Texture("pig_lila.jpg");
		fox_lila = 	new Texture("fox_lila.jpg");
		bear_lila = 	new Texture("bear_lila.jpg");
		squirrel_lila =new Texture("squirrel_lila.jpg");
		hippo_lila= 	new Texture("hippo_lila.jpg");
		crocodile_lila=new Texture("crocodile_lila.jpg");
		elephant_lila =new Texture("elephant_lila.jpg");
		monkey_lila =	new Texture("monkey_lila.jpg");

		//Animals orange
		sheep_orange = 	new Texture("sheep_orange.jpg");
		duck_orange = 	new Texture("duck_orange.jpg");
		pig_orange = 	new Texture("pig_orange.jpg");
		fox_orange = 	new Texture("fox_orange.jpg");
		bear_orange = 	new Texture("bear_orange.jpg");
		squirrel_orange =new Texture("squirrel_orange.jpg");
		hippo_orange= 	new Texture("hippo_orange.jpg");
		crocodile_orange=new Texture("crocodile_orange.jpg");
		elephant_orange =new Texture("elephant_orange.jpg");
		monkey_orange =	new Texture("monkey_orange.jpg");

		//Animals brown
		sheep_brown = 	new Texture("sheep_brown.jpg");
		duck_brown = 	new Texture("duck_brown.jpg");
		pig_brown = 	new Texture("pig_brown.jpg");
		fox_brown = 	new Texture("fox_brown.jpg");
		bear_brown = 	new Texture("bear_brown.jpg");
		squirrel_brown =new Texture("squirrel_brown.jpg");
		hippo_brown= 	new Texture("hippo_brown.jpg");
		crocodile_brown=new Texture("crocodile_brown.jpg");
		elephant_brown =new Texture("elephant_brown.jpg");
		monkey_brown =	new Texture("monkey_brown.jpg");

		//Animals red
		sheep_red = 	new Texture("sheep_red.jpg");
		duck_red = 	new Texture("duck_red.jpg");
		pig_red = 	new Texture("pig_red.jpg");
		fox_red = 	new Texture("fox_red.jpg");
		bear_red = 	new Texture("bear_red.jpg");
		squirrel_red =new Texture("squirrel_red.jpg");
		hippo_red= 	new Texture("hippo_red.jpg");
		crocodile_red=new Texture("crocodile_red.jpg");
		elephant_red =new Texture("elephant_red.jpg");
		monkey_red =	new Texture("monkey_red.jpg");

		//Animals rosa
		sheep_rosa = 	new Texture("sheep_rosa.jpg");
		duck_rosa = 	new Texture("duck_rosa.jpg");
		pig_rosa = 	new Texture("pig_rosa.jpg");
		fox_rosa = 	new Texture("fox_rosa.jpg");
		bear_rosa = 	new Texture("bear_rosa.jpg");
		squirrel_rosa =new Texture("squirrel_rosa.jpg");
		hippo_rosa= 	new Texture("hippo_rosa.jpg");
		crocodile_rosa=new Texture("crocodile_rosa.jpg");
		elephant_rosa =new Texture("elephant_rosa.jpg");
		monkey_rosa =	new Texture("monkey_rosa.jpg");

		//Animals yellow
		sheep_yellow = 	new Texture("sheep_yellow.jpg");
		duck_yellow = 	new Texture("duck_yellow.jpg");
		pig_yellow = 	new Texture("pig_yellow.jpg");
		fox_yellow = 	new Texture("fox_yellow.jpg");
		bear_yellow = 	new Texture("bear_yellow.jpg");
		squirrel_yellow =new Texture("squirrel_yellow.jpg");
		hippo_yellow= 	new Texture("hippo_yellow.jpg");
		crocodile_yellow=new Texture("crocodile_yellow.jpg");
		elephant_yellow =new Texture("elephant_yellow.jpg");
		monkey_yellow =	new Texture("monkey_yellow.jpg");
		*/


	}

	@Override
	public void render () {
		super.render();
	}
}
