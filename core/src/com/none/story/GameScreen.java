package com.none.story;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

import jdk.javadoc.internal.doclets.formats.html.Table;

public class GameScreen extends ScreenAdapter {
    SpriteBatch batch;
    OrthographicCamera camera;
    InfoScreen loadScreen;
    CringeStory cringeStory;

    public static final int SCR_WIDTH = 1920;
    public static final int SCR_HEIGHT = 1024;

    GameScreen(CringeStory cringeStory) {

        this.cringeStory = cringeStory;
        String text = "Hello everyone";
        loadScreen = new InfoScreen(this, "main_background2.jpg", text);
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
    }
    @Override
    public void show() {
        camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);
//        batch.begin();
//        font.draw(batc
//        h, "Hello", 50, 50);
//        batch.end();
        cringeStory.setScreen(loadScreen);
    }

    public static BitmapFont getFont() {
        FreeTypeFontGenerator fontGenerator =
                new FreeTypeFontGenerator(Gdx.files.internal("OpenSans.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter fontParameters = new FreeTypeFontGenerator.FreeTypeFontParameter();
        fontParameters.size = 50;
        fontParameters.color = Color.WHITE;
        fontParameters.borderWidth = 2;
        fontParameters.borderColor = Color.BLACK;
        fontParameters.borderStraight = true;
        fontParameters.minFilter = Texture.TextureFilter.Linear;
        fontParameters.magFilter = Texture.TextureFilter.Linear;
        return fontGenerator.generateFont(fontParameters);
    }

}
