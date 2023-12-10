package com.none.story;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class LoadScreen extends ScreenAdapter {
    Texture background;
    SpriteBatch batch;

    LoadScreen() {
        batch = new SpriteBatch();
        background = new Texture("main_background.jpg");
    }

    @Override
    public void render(float delta) {
        batch.begin();
        // Draw the background image
        batch.draw(background, 0, 0);

        // Draw text
        BitmapFont font = new BitmapFont();
        font.draw(batch, "Hello", 50, 50);

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        background.dispose();
    }
}
