package com.none.story;

import com.badlogic.gdx.ScreenAdapter;

public class GameScreen extends ScreenAdapter {
    LoadScreen loadScreen;
    CringeStory cringeStory;

    GameScreen(CringeStory cringeStory) {
        this.cringeStory = cringeStory;
        loadScreen = new LoadScreen();
    }
    @Override
    public void show() {
        cringeStory.setScreen(loadScreen);
    }
}
