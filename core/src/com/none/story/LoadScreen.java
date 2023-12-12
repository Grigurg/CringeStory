package com.none.story;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;
import com.none.story.CringeStory;

import components.TextButton;


public class LoadScreen extends ScreenAdapter {
    Texture background;
    SpriteBatch batch;
    GameScreen gameScreen;
    TextButton buttonStart;

    LoadScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        batch = new SpriteBatch();
        background = new Texture("img.png");
        buttonStart = new TextButton(700, 150, "Start");
//        font = new BitmapFont();
//        font.getData().scale(5f);
//        font.setColor(0, 0, 0, 1);
//        font.
//        startButton = new TextButton("yeah", Skin);
    }

    @Override
    public void show() {
        batch.setProjectionMatrix(gameScreen.camera.combined);
    }
    @Override
    public void render(float delta) {
        gameScreen.camera.update();
        batch.begin();
        batch.draw(background, 0, 0, GameScreen.SCR_WIDTH, GameScreen.SCR_HEIGHT);
        buttonStart.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
//        batch.dispose();
//        background.dispose();
    }
}
