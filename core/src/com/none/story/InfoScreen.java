package com.none.story;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class InfoScreen implements Screen {
    Texture background;
    SpriteBatch batch;
    GameScreen gameScreen;
    String text, message;
    BitmapFont font;
    MyShapeRenderer shapeRenderer;
    int counter = 0;
    InfoScreen(GameScreen gameScreen, String back, String text) {
        background = new Texture(back);
        batch = new SpriteBatch();
        this.gameScreen = gameScreen;
        this.text = text;
        message = "";
        font = GameScreen.getFont();
        shapeRenderer = new MyShapeRenderer();
    }

    @Override
    public void show() {
        batch.setProjectionMatrix(gameScreen.camera.combined);
        shapeRenderer.setProjectionMatrix(gameScreen.camera.combined);
    }

    @Override
    public void render(float delta) {
        animateText();
        batch.begin();
        batch.draw(background, 0, 0, GameScreen.SCR_WIDTH, GameScreen.SCR_HEIGHT);
        batch.end();
        batch.enableBlending();

//        GlyphLayout gl = new GlyphLayout(font, message);

        Gdx.gl.glEnable(GL20.GL_BLEND);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(1f, 1f, 1f, .6f);
        float rectWidth = GameScreen.SCR_WIDTH - 100;
        float rectHeight = 150;
        float x = (GameScreen.SCR_WIDTH - rectWidth) / 2;
//        float y = (GameScreen.SCR_HEIGHT - rectHeight) / 2;
        float y = 20;
        shapeRenderer.roundedRect(x, y, rectWidth, rectHeight, 30);
        shapeRenderer.end();

        batch.begin();
        font.draw(batch, message, x + 50, y + rectHeight / 2);
        batch.end();
    }

    private void animateText() {
        counter++;
        int speed = 10;
        if (counter % speed == 0 && message.length() != text.length())
            message += text.charAt(counter / speed - 1);
    }

//    @Override
//    public void render(float delta) {
////        batch.begin();
////        batch.draw(background, 0, 0, GameScreen.SCR_WIDTH, GameScreen.SCR_HEIGHT);
////        batch.end();
//        GlyphLayout gl = new GlyphLayout(gameScreen.font, text);
//        shapeRenderer.setProjectionMatrix(gameScreen.camera.combined);
//        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
////        shapeRenderer.rect(5, 5, 300, 300);
//        shapeRenderer.rect(GameScreen.SCR_WIDTH / 2, GameScreen.SCR_HEIGHT / 2, gl.width, gl.height);
//        shapeRenderer.end();
//
////        shapeRenderer.box(0, 0, 0, 10, 10, 50);
//
////        shapeRenderer.setProjectionMatrix(gameScreen.camera.combined);
////        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
////
////        float boxWidth = 50; // Ширина квадрата
////        float boxHeight = 50; // Высота квадрата
////        float cornerRadius = 20; // Радиус закругленных углов
////        float boxX = (GameScreen.SCR_WIDTH - boxWidth) / 2; // Центрирование квадрата по горизонтали
////        float boxY = (GameScreen.SCR_HEIGHT - boxHeight) / 2; // Центрирование квадрата по вертикали
////
////         Отрисовка белого квадрата с круглыми краями
////        shapeRenderer.setColor(1, 1, 1, 1); // Установка цвета (белый)
////        shapeRenderer.rect(boxX, boxY, boxWidth, boxHeight);
////        shapeRenderer.end();
//
//        // Отрисовка текста по середине квадрата
////        batch.begin();
////        float textWidth = font.getBounds(text).width;
////        float textHeight = font.getBounds(text).height;
////        float textX = boxX + (boxWidth - textWidth) / 2;
////        float textY = boxY + (boxHeight + textHeight) / 2;
////
////        font.draw(batch, text, textX, textY);
////        batch.end();
////        batch.end();
//    }

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
        batch.dispose();
    }
}
