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
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MyGdxGame implements ApplicationListener {
	private Texture texture;
	Stage stage2;
	Stage stage;
	Image figura;
	Image figura2;
	Image figura3;
	Image figura4;
	Image figura5;
	Image figura6;
	Image image1;
	//Image fondo;
	boolean izquierda=false;
	
	int a=1;
	int b=0;
	
	Stage stage1;
	
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		texture = new Texture(Gdx.files.internal("data/circulo.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 128, 128);
		
		stage = new Stage();
		
		
		figura = new Image(region);
		figura2 = new Image(new Texture(Gdx.files.internal("data/rectangulo.png")));
		figura3 = new Image(new Texture(Gdx.files.internal("data/estrella.png")));
		figura4 = new Image(new Texture(Gdx.files.internal("data/triangulo.png")));
		figura5 = new Image(new Texture(Gdx.files.internal("data/pentagono.png")));
		stage1= new Stage();
		image1=new Image(region);
		image1.addListener(new ClickListener());
		figura.setX(325);
		figura.setY(100);
		figura2.setX(100);
		figura2.setY(300);
		figura3.setX(500);
		figura3.setY(150);
		figura5.setX(200);
		figura5.setY(200);
		
		stage.addActor(figura);
		stage.addActor(figura2);
		stage.addActor(figura3);
		stage.addActor(figura4);
		stage.addActor(figura5);
		stage1.addActor(image1);
		//stage2.addActor(fondo);
		
	}

	@Override
	public void dispose() {
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		figura2.setRotation(figura2.getRotation()-1);
		figura.setX(figura.getX()+2);
		figura3.setY(figura3.getY()+3);
		figura3.setX(figura3.getX()-1);
		figura3.setScale(figura3.getScaleX()-0.1f,figura3.getScaleY()+0.1f);
		//fondo.setScale(figura3.getScaleX()-0.1f,figura3.getScaleY()+0.1f);
		
		if (figura4.getX()>300)
		{
			izquierda=true;
		}
		if(figura4.getX()<1)
		{
			izquierda = false;
		}

		if (izquierda==true)
		{
		figura4.setX(figura4.getX()-1);
		}
		else
		{
			figura4.setX(figura4.getX()+1);
		}
		
			System.out.println("a: "+a+" x:"+figura5.getX()+" y"+figura5.getY());
		
		
			if (figura5.getY()>300)
			{
			a=0;
			}
			
			if (a==1)
			{
				figura5.setY(figura5.getY()+1);
			}
		

			if (figura5.getX()>300)
			{
			a=1;
			}
			
			if (a==0)
			{
				figura5.setX(figura5.getX()+1);
			}
			

			if (figura5.getY()>300 && figura5.getX()>=300)
			{
			a=2;
			}
			
			if (a==2)
			{
				figura5.setY(figura5.getY()-1);
				
			}
			
			if (figura5.getY()<150 && figura5.getX()<=300)
			{
			a=3;
			}
			
			if (a==3)
			{
				figura5.setX(figura5.getX()-1);
			}
			
			
			
			
	
		stage.draw();
		stage1.draw();
		//stage2.draw();
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
