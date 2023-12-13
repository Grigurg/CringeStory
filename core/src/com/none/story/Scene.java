package com.none.story;

import com.badlogic.gdx.utils.Json;

import java.util.List;

public class Scene {
    String background;
    Json js;
    Scene(String background, Json js) {
        this.background = background;
        this.js = js;
    }
}
