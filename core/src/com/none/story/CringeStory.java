package com.none.story;

import com.badlogic.gdx.Game;

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
