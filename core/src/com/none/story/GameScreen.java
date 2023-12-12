package com.none.story;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
    SpriteBatch batch;
    OrthographicCamera camera;
    InfoScreen loadScreen;
    CringeStory cringeStory;

    public static final int SCR_WIDTH = 1920;
    public static final int SCR_HEIGHT = 1024;

    GameScreen(CringeStory cringeStory) {
        this.cringeStory = cringeStory;
        String text = "Some cool text";
        loadScreen = new InfoScreen(this, "main_background2.jpg", text);
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
    }
    @Override
    public void show() {
        camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);
//        batch.begin();
//        font.draw(batch, "Hello", 50, 50);
//        batch.end();
        cringeStory.setScreen(loadScreen);
    }

    public static BitmapFont getFont() {
        return new BitmapFont(Gdx.files.internal("ch/font.fnt"), Gdx.files.internal("ch/font.png"), false);
    }
}
