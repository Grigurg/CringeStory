package com.none.story;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class CringeStory extends Game {
	OrthographicCamera camera;
	int SCR_WIDTH = 1280;
	int SCR_HEIGHT = 720;
	GameScreen gameScreen;

	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);
		gameScreen = new GameScreen(this);
		setScreen(gameScreen);
	}
	
	@Override
	public void dispose () {
	}
}
