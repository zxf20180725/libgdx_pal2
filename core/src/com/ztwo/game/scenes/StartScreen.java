package com.ztwo.game.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class StartScreen implements Screen {

    //背景图片
    private Texture bg;
    private SpriteBatch batch = new SpriteBatch();
    // 按钮
    private Button button;
    private Stage stage;

    public StartScreen() {
        stage = new Stage();
        bg = new Texture("bg.png");
        Button.ButtonStyle style = new Button.ButtonStyle();
        Texture upTexture = new Texture(Gdx.files.internal("btn1.png"));
        Texture downTexture = new Texture(Gdx.files.internal("btn2.png"));
        style.up = new TextureRegionDrawable(new TextureRegion(upTexture));
        style.down = new TextureRegionDrawable(new TextureRegion(downTexture));
        style.over = new TextureRegionDrawable(new TextureRegion(downTexture));
        button = new Button(style);
        button.setPosition(50, 50);
        stage.addActor(button);
        Gdx.input.setInputProcessor(stage);
        button.addListener(new StartBtnEvent());
        System.out.println("12312312312");
    }

    private class StartBtnEvent extends InputListener {
        public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
            System.out.println(x + "," + y);
            return true;
        }
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        // 设置清屏颜色为红色（RGBA）
        Gdx.gl.glClearColor(0, 0, 0, 1);
        // 清屏
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();    //舞台逻辑更新

        batch.begin();
        batch.draw(bg, 0, 0);
        batch.end();

        stage.draw();   //舞台画面更新

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
