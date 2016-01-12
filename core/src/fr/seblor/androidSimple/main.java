package fr.seblor.androidSimple;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class main extends Game {
	SpriteBatch batch;
	Texture img;

	@Override
	public void create() {

		setScreen(new myScreen());

	}

	@Override
	public void render() {
		
		super.render();
		
	}
}

