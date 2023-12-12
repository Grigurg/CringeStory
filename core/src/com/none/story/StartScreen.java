package com.none.story;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;

import components.TextButton;

public class StartScreen implements Screen {
TextButton buttonRestart;
GameScreen gameScreen;
    public StartScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
        buttonRestart = new TextButton(100, 400, "Restart");

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        if (Gdx.input.justTouched()) {

            Vector3 touch = gameScreen.camera.unproject(
                    new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0)
            );

            if (buttonRestart.isHit((int) touch.x, (int) touch.y)) {
                gameScreen.seterScreen();
            }
        }

        ScreenUtils.clear(1, 0, 0, 1);
        gameScreen.camera.update();
        gameScreen.batch.setProjectionMatrix(gameScreen.camera.combined);
        gameScreen.batch.begin();

        buttonRestart.draw(gameScreen.batch);

        gameScreen.batch.end();
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
