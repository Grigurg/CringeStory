package components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

public class TextButton {

    BitmapFont font;

    String text;
    Texture texture;

    int x, y;
    int textX, textY;
    int buttonWidth, buttonHeight;
    int textWidth, textHeight;

//    FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("th/ofont.ru_Cygre.ttf"));
//    FreeTypeFontParameter parameter = new FreeTypeFontParameter();
//    parameter.size = 12;
//    BitmapFont font12 = generator.generateFont(parameter); // font size 12 pixels
//    generator.dispose(); // don't forget to dispose to avoid memory leaks!
//

    public TextButton(int x, int y, String text) {
        this.text = text;
        this.x = x;
        this.y = y;

        font = new BitmapFont(Gdx.files.internal("ch/font.fnt"), Gdx.files.internal("ch/font.png"), false);

//        font.getData().scale(5f);
//        font.setColor(Color.WHITE);

        GlyphLayout gl = new GlyphLayout(font, text);
        textWidth = (int) gl.width;
        textHeight = (int) gl.height;

        texture = new Texture("button_bg.png");
        buttonWidth = texture.getWidth();
        buttonHeight = texture.getHeight();

        textX = x + (buttonWidth - textWidth) / 2;
        textY = y + (buttonHeight + textHeight) / 2;
    }

    public boolean isHit(int tx, int ty) {
        System.out.println(tx + " - " + ty);
        System.out.println(x + " - " + y);
        return tx >= x && tx <= x + buttonWidth
                && ty >= y && ty <= y + buttonHeight;
    }

    public void draw(Batch batch) {
        batch.draw(texture, x, y, buttonWidth, buttonHeight);
        font.draw(batch, text, textX, textY);
    }
    public void dispose() {
        texture.dispose();
        font.dispose();
    }
}
