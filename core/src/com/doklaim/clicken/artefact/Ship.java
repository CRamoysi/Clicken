package com.doklaim.clicken.artefact;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.doklaim.clicken.Artefact;
import com.doklaim.clicken.Config;
import com.doklaim.clicken.View;

public class Ship extends Artefact{

	public Ship() {
		
		//addSprite(new Sprite(new Texture("ship.png")));

		
	}

	@Override
	public void create(View v) {
		Texture t = new Texture("ship.png");
		
		Sprite sprite = new Sprite(t);
		sprite.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);
		sprite.setSize(sprite.getWidth()/Config.SCALE_W, sprite.getHeight()/Config.SCALE_W);

		addSprite(sprite);
		
		this.setR(0, 0);
		this.setS(0, 0);
		this.setSpeed(Config.SPEED_X,  Config.SPEED_Y);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update() {
		if(this.getSX() < 0){
			this.setSX(0);
		}
		if(this.getSX()>Config.WINDOW_W-this.getWidth()){
			this.setSX(Config.WINDOW_W-this.getWidth());
		}
		if(this.getSY() < 0){
			this.setSY(0);
		}
		if(this.getSY()>Config.WINDOW_H-this.getHeight()){
			this.setSY(Config.WINDOW_H-this.getHeight());
		}
		
	}

	@Override
	public void beforeUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterUpdate() {
		// TODO Auto-generated method stub
		
	}

	public void move(float x, float y){
		this.moveX(x);
		this.moveY(-y);		
	}
}
