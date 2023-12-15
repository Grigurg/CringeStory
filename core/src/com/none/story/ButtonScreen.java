package com.none.story;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

import components.TextButton;

public class ButtonScreen extends MyScreen {
    String[] buttonsText;
    ArrayList<TextButton> buttons;
    int buttonHeight = 200;
//    SpriteBatch batch;

    ButtonScreen(CringeStory cringeStory, String background, String text,
                 String[] buttons) {
        super(cringeStory, background, text);
        this.buttonsText = buttons;
        this.buttons = new ArrayList<>();

        for (int i = 0; i < buttonsText.length; ++i) {
            this.buttons.add(new TextButton(CringeStory.SCR_WIDTH / 2 - 300, super.y + super.rectHeight + buttonHeight * i, buttonsText[i]));
        }
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        super.batch.begin();
        for (TextButton button : buttons) {
            button.draw(super.batch);
        }
        super.batch.end();
    }
}
