/**
 * 
 */
package com.doklaim.clicken;

import java.util.ArrayList;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Un Artefact est un objet pouvant etre affiché et interagir avec d'autre Artefact.
 * @author rci
 * @version 1.0
 */
public abstract class Artefact {
	//=====POSITIONNEMENT==================================================
	//--Position à l'ecran-----------------
	private float sx = 0, sy = 0;
	public float getSX(){return this.sx;}
	public float getSY(){return this.sy;}
	public void setSX(float sx){
		this.sx = sx;
		for(final Sprite s: this.sprites){
			s.setX(sx);
		}
	}
	public void setSY(
			float sy){this.sy = sy;
			for(final Sprite s: this.sprites){
				s.setY(sy);
			}
	}
	public void setS(float sx, float sy){
		this.sx = sx;
		this.sy = sy;
		for(final Sprite s: this.sprites){
			s.setPosition(sx, sy);
		}
	}
	//--Vraie position---------------------
	private float rx = 0, ry= 0;
	public float getRX(){return this.rx;}
	public float getRY(){return this.ry;}
	public void setRX(float rx){this.rx = rx;}
	public void setRY(float ry){this.ry = ry;}
	public void setR(float rx, float ry){
		this.rx = rx;
		this.ry = ry;
		for(final Sprite s: this.sprites){
			s.setPosition(rx, ry);
		}
	}
	public void moveX(float m){
		this.sx += m;
		this.rx += m;
	}
	public void moveY(float m){
		this.sy += m;
		this.ry += m;
	}
	//--Deplacements-----------------------
	private float speedX , speedY = 0;
	public void setSpeed(float x, float y){this.speedX=x;this.speedY=y;}
	public void move(float x, float y){

		if(x>0){
			this.moveX(speedX);
		}else if(x<0){
			this.moveX(-speedX);
		}
		if(y>0){
			this.moveY(-speedY);
		}else if(y<0){
			this.moveY(speedY);
		}
		
	}
	
	
	
	//--VIEW-----------------------------------
	private View view;
	/**
	 * À true l'artefact possède une animation
	 */
	private boolean isAnimated = false;
	public void isAnimated(boolean isAnimated){this.isAnimated = isAnimated;}
	public boolean isAnimated(){return this.isAnimated;}
	//--TEXTURE----------------------------
	private ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	public Sprite getSprite(int i) {return this.sprites.get(i);}
	public ArrayList<Sprite> getTextures(){return this.sprites;}
	public void addSprite(Sprite t){this.sprites.add(t);}
	public void setSprites(ArrayList<Sprite> t){this.sprites = t;}
	
	
	
	//=====================================================================
	
	/**
	 * Cette methode gere la creation d'un Artefact
	 */
	public void create(View v){this.view = v;}
	/**
	 * Cette methode gere la destruction d'un Artefact
	 */
	public abstract void dispose();
	/**
	 * Cette methode gere l'affichage d'un Artefact
	 * @param batch 
	 */
	public void render(SpriteBatch batch){
		if(!this.sprites.isEmpty()){
			if(!isAnimated){
					batch.draw(getSprite(0), sx, sy);
			}
		}
	}
	
	
	/**
	 * Cette methode gere la mise à jour de l'état d'un artefact
	 */
	public abstract void update();
	/**
	 * Cette methode gere ce qu'il peux se passer avant la mise à jour d'un Artefact
	 */
	public abstract void beforeUpdate();
	/**
	 * Cette methode gere ce qu'il peux se passer apres la mise à jour d'un Artefact
	 */
	public abstract void afterUpdate();
	
	
	//=====================================================================
	
}
