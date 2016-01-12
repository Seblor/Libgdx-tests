package fr.seblor.androidSimple;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class myScreen implements Screen {

	private FPSLogger _fpsLogger;
	private float _spaceshipX;
	private SpriteBatch _batch;
	private Pixmap _pixmap;
	private Sprite _spaceship;

	public myScreen() {
		super();

		/*
		 * Setting up the screen & FPSlogger
		 */
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		this._fpsLogger = new FPSLogger();

		/*
		 * Setting up the sprites
		 */
		_batch = new SpriteBatch();
		_spaceship = new Sprite(new Texture(Gdx.files.internal("spaceship.png")));
		_spaceship.setBounds(0, 0, _spaceship.getWidth() / 3, _spaceship.getHeight() / 3);

		_spaceshipX = Gdx.graphics.getWidth() / 2 - _spaceship.getWidth() / 2;

		_pixmap = new Pixmap(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), Pixmap.Format.RGB888);
		_pixmap.setColor(Color.BLACK);
		_pixmap.fill();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		/*
		 * Log FPS
		 */
		_fpsLogger.log();

		/*
		 * Screen touched = player move
		 */
		if (Gdx.input.isTouched()) {
			_spaceshipX = Gdx.input.getX() - _spaceship.getWidth() / 2;
		}

		/*
		 * Drawing
		 */
		_batch.begin();
		_batch.draw(_spaceship, _spaceshipX, 0, _spaceship.getWidth(), _spaceship.getHeight());
		_batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
