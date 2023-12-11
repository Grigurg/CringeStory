package com.none.story;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
    SpriteBatch batch;
    OrthographicCamera camera;
    LoadScreen loadScreen;
    CringeStory cringeStory;
    public static final int SCR_WIDTH = 1920;
    public static final int SCR_HEIGHT = 1024;

    GameScreen(CringeStory cringeStory) {
        this.cringeStory = cringeStory;
        loadScreen = new LoadScreen(this);
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
    }
    @Override
    public void show() {
        camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);
        cringeStory.setScreen(loadScreen);
    }
}
