package com.doklaim.clicken.artefact;

import com.badlogic.gdx.Gdx;
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
		System.out.println(sprite.getWidth()+".."+ sprite.getHeight());
		addSprite(sprite);
		
		System.out.println(sprite.getWidth()/Config.SCALE_W+".."+ sprite.getHeight()/Config.SCALE_W);
		System.out.println(v.getW()/2+".."+ v.getH()/2);
		this.setR(v.getW()/2, v.getH()/2);
		this.setS(v.getW()/2, v.getH()/2);
		this.setSpeed(Config.SPEED_X,  Config.SPEED_Y);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		
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
