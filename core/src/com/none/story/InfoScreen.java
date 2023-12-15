//package com.none.story;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.BitmapFont;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
//import com.badlogic.gdx.utils.Json;
//import com.badlogic.gdx.utils.ScreenUtils;
//
//public class InfoScreen implements Screen {
//    Texture background;
//    SpriteBatch batch;
//    CringeStory cringeStory;
//    String text, message;
//    BitmapFont font;
//    MyShapeRenderer shapeRenderer;
//    int counter = 0;
////    OnFinishFunc func;
////    boolean finish = false;
//
////    interface OnFinishFunc {
////        void func();
////    }
//
//    InfoScreen(CringeStory cringeStory, String background, String text) {
//        this.background = new Texture(background);
//        batch = new SpriteBatch();
//        this.cringeStory = cringeStory;
//        this.text = text;
//        message = "";
//        font = CringeStory.getFont();
//        shapeRenderer = new MyShapeRenderer();
//    }
//
//    @Override
//    public void show() {
//        batch.setProjectionMatrix(cringeStory.camera.combined);
//        shapeRenderer.setProjectionMatrix(cringeStory.camera.combined);
//    }
//
//    @Override
//    public void render(float delta) {
//        ScreenUtils.clear(1, 1, 0, 1);
//        animateText();
//        batch.begin();
//        batch.draw(background, 0, 0, CringeStory.SCR_WIDTH, CringeStory.SCR_HEIGHT);
//        batch.end();
//        batch.enableBlending();
//
////        GlyphLayout gl = new GlyphLayout(font, message);
////
//        Gdx.gl.glEnable(GL20.GL_BLEND);
//        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
//        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
//        shapeRenderer.setColor(1f, 1f, 1f, .6f);
//        float rectWidth = CringeStory.SCR_WIDTH - 100;
//        float rectHeight = 150;
//        float x = (CringeStory.SCR_WIDTH - rectWidth) / 2;
////        float y = (GameScreen.SCR_HEIGHT - rectHeight) / 2;
//        float y = 20;
//        shapeRenderer.roundedRect(x, y, rectWidth, rectHeight, 30);
//        shapeRenderer.end();
//
//        batch.begin();
//        font.draw(batch, message, x + 50, y + rectHeight / 2);
//        batch.end();
//    }
//
//    private void animateText() {
//        counter++;
//        int speed = 10;
//        if (counter % speed == 0 && message.length() != text.length())
//            message += text.charAt(counter / speed - 1);
////        if (text.length() == message.length())
////            onFinish();
//    }
//    @Override
//    public void resize(int width, int height) {
//
//    }
//
//    @Override
//    public void pause() {
//
//    }
//
//    @Override
//    public void resume() {
//
//    }
//
//    @Override
//    public void hide() {
//
//    }
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//    }
//}
