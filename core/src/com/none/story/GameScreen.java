//package com.none.story;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.ScreenAdapter;
//import com.badlogic.gdx.graphics.Color;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.BitmapFont;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GameScreen extends ScreenAdapter {
//    SpriteBatch batch;
//    OrthographicCamera camera;
//    InfoScreen loadScreen;
//    CringeStory cringeStory;
//    ArrayList<Screen> screens;
//    int nextScreenId = 0;
//    int curScreenId = -1;
//
//    public static final int SCR_WIDTH = 1920;
//    public static final int SCR_HEIGHT = 1024;
//
//    GameScreen(CringeStory cringeStory) {
//        this.cringeStory = cringeStory;
//        batch = new SpriteBatch();
//        camera = new OrthographicCamera();
//
//        init();
//    }
//
//    void init() {
//        screens = new ArrayList<>();
//        screens.add(new InfoScreen(this, "main_background2.jpg", "Hello"));
//        screens.add(new InfoScreen(this, "main_background2.jpg", "Hello2"));
//        screens.add(new InfoScreen(this, "main_background2.jpg", "Hello3"));
//        screens.add(new InfoScreen(this, "main_background2.jpg", "Hello4"));
//    }
//
//    @Override
//    public void render(float delta) {
//        if (Gdx.input.justTouched()) {
//            System.out.println("Timlid");
//            ++nextScreenId;
//        }
//        if (curScreenId != nextScreenId) {
//            curScreenId = nextScreenId;
//            cringeStory.setScreen(screens.get(curScreenId));
//        }
//    }
//
//    @Override
//    public void show() {
//        camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);
////        Screensaver screen = new Screensaver();
////        cringeStory.setScreen(screen);
////        cringeStory.setScreen(loadScreen);
//    }
//
//    public static BitmapFont getFont() {
//        FreeTypeFontGenerator fontGenerator =
//                new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
//        FreeTypeFontGenerator.FreeTypeFontParameter fontParameters = new FreeTypeFontGenerator.FreeTypeFontParameter();
//        fontParameters.size = 100;
//        fontParameters.color = Color.WHITE;
//        fontParameters.borderWidth = 2;
//        fontParameters.borderColor = Color.BLACK;
//        fontParameters.borderStraight = true;
//        fontParameters.minFilter = Texture.TextureFilter.Linear;
//        fontParameters.magFilter = Texture.TextureFilter.Linear;
//        return fontGenerator.generateFont(fontParameters);
//    }
//
//}
