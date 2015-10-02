package com.doklaim.clicken.artefact;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.doklaim.clicken.Artefact;
import com.doklaim.clicken.View;

public class Ship extends Artefact{

	public Ship() {
		addSprite(new Sprite(new Texture("ship.png")));
	}

	@Override
	public void create(View v) {
		System.out.println(v.getW()/2+".."+ v.getH()/2);
		this.setR(v.getW()/2, v.getH()/2);
		this.setS(v.getW()/2, v.getH()/2);
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

}
