package com.doklaim.clicken;

import com.badlogic.gdx.Gdx;

public interface Config {

	public static final float WINDOW_W = 480;
	public static final float WINDOW_H = 600;
	
	public static final float SCALE_W = WINDOW_W / Gdx.graphics.getWidth();
	
	
	
	public static float SPEED_X = 5 / SCALE_W;
	public static float SPEED_Y = 5 / SCALE_W;
	
	
	
}
