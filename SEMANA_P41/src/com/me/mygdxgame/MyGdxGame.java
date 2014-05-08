package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGdxGame implements ApplicationListener {
	private Texture texture;
	Stage stage;
	Image image;
	Image image2;
	Image image3;
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		texture = new Texture(Gdx.files.internal("data/pacman_multi_agent.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 512);
		
		stage = new Stage();
		image = new Image(region);
		stage = new Stage();
		image2 = new Image(new Texture(Gdx.files.internal("data/pacman.png")));
		stage = new Stage();
		image3 = new Image(new Texture(Gdx.files.internal("data/th_Pacman.png")));
	
	
		image.setScale(1.5f, 1.5f);
	 image.setX(50);
	image.setY(-300);
	 image2.setX(5);
	 image2.setY(-90);
	 image3.setX(570);
	 image3.setY(-100);

		stage.addActor(image);
		stage.addActor(image2);
		stage.addActor(image3);
	
	}

	@Override
	public void dispose() {
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		image2.setRotation(image.getRotation()+5);
		
		stage.draw();
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
}
