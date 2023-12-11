package com.none.story;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class CringeStory extends Game {
	GameScreen gameScreen;

	@Override
	public void create () {
		gameScreen = new GameScreen(this);
		setScreen(gameScreen);
//		camera.update();
//		batch.setProjectionMatrix(camera.combined);
//		Texture back = new Texture("main_background.jpg");
//		batch.begin();
//		batch.draw(back, 0, 0, SCR_WIDTH, SCR_HEIGHT);
//		batch.end();
	}
	
	@Override
	public void dispose () {
//		gameScreen.dispose();
	}
}
