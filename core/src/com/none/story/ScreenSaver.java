package com.none.story;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

class Screensaver extends ScreenAdapter {
    private SpriteBatch batch;
    private Texture image1, image2;
    private float imageX, imageY;
    private int speed;
    private boolean image1Displayed = true;

    public Screensaver() {
        batch = new SpriteBatch();
        image1 = new Texture("load_screen/1.png");
        image2 = new Texture("load_screen/2.png");

        imageX = 0;
        imageY = 100;
        speed = 0;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // Clear the screen or set a background color if you want

        batch.begin();

        if (image1Displayed) {
            batch.draw(image1, imageX, imageY);
            imageY -= delta * speed;
            if (imageY <= 0) {
                imageY = 0;
                image1Displayed = false;
            }
        } else {
            batch.draw(image2, 0, 0);
        }

        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

}
