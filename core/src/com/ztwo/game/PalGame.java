package com.ztwo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ztwo.game.scenes.StartScreen;

public class PalGame extends Game {

    private StartScreen startScreen=null;

    @Override
    public void create() {
        startScreen=new StartScreen();
        setScreen(startScreen);
    }


    @Override
    public void dispose() {

    }
}
