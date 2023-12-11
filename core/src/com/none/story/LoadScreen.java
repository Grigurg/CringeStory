package com.none.story;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.ScreenUtils;
import com.none.story.CringeStory;

public class LoadScreen extends ScreenAdapter {
    Texture background;
    SpriteBatch batch;
    GameScreen gameScreen;
    BitmapFont font;
    TextButton startButton;

    LoadScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        batch = new SpriteBatch();
        background = new Texture("main_background.jpg");
        font = new BitmapFont();
        font.getData().scale(5f);
        font.setColor(0, 0, 0, 1);
        font.
//        startButton = new TextButton("yeah", Skin);
    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(background, 0, 0, GameScreen.SCR_WIDTH, GameScreen.SCR_HEIGHT);
        font.getData().
        batch.end();
    }

    @Override
    public void dispose() {
//        batch.dispose();
//        background.dispose();
    }
}
