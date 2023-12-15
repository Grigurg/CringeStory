package com.none.story;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class CringeStory extends Game {
	SpriteBatch batch;
	OrthographicCamera camera;
	ArrayList<Screen> screens;

	public static final int SCR_WIDTH = 1920;
	public static final int SCR_HEIGHT = 1024;

	int nextScreenId = 0;
	int curScreenId = -1;

	void init() {
		screens = new ArrayList<>();
		screens.add(new MyScreen(this, "main_background2.jpg", "Привет"));
		screens.add(new ButtonScreen(this, "main_background.jpg", "Приветик", new String[]{"vhvhvhjvh", "Button2"}));
		screens.add(new MyScreen(this, "img.png", "Пртивет4"));
		screens.add(new MyScreen(this, "main_background2.jpg", "ВОт е привет"));
	}

	@Override
	public void create() {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);
		init();
	}


//	@Override
//	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//		currentScreenIndex = (currentScreenIndex + 1) % screens.length;
//		setScreen(screens[currentScreenIndex]);
//		return true;
//	}

	@Override
	public void render() {
		super.render();
		if (Gdx.input.justTouched()) {
			++nextScreenId;
		}
		if (curScreenId != nextScreenId) {
			curScreenId = nextScreenId;
			setScreen(screens.get(curScreenId));
		}
	}

	public static BitmapFont getFont() {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("21066.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.color = Color.WHITE;
		parameter.size = 100;
		parameter.borderColor = Color.BLACK;
		parameter.borderWidth = 1;
		parameter.borderStraight = true;
		parameter.characters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyzАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\/?-+=()*&.;:,{}\"´`'<>";
		BitmapFont font = generator.generateFont(parameter);
		generator.dispose();
		font.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		return font;
	}
}
