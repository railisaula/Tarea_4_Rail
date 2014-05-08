package com.me.mygdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "SEMANA_P41";
		cfg.useGL20 = false;
		cfg.width = 750;
		cfg.height = 500;
		
		new LwjglApplication(new MyGdxGame(), cfg);
	}
}
