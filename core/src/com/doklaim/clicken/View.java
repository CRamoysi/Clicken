/**
 * 
 */
package com.doklaim.clicken;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector.GestureListener;

/**
 * @author rci
 *
 */
public abstract class View implements ApplicationListener, GestureListener, InputProcessor{
	//=====VIEW DISPLAY===================================================
	private OrthographicCamera camera;
	public OrthographicCamera getCamera(){return this.camera;}
	private SpriteBatch batch;
	public SpriteBatch getBatch(){return this.batch;}
	
	//=====VIEW DETAILS====================================================
	private float w = 0, h = 0;
	public float getW(){return this.w;}
	public float getH(){return this.h;}

	//=====ARTIFACTS IN THE VIEW===========================================
	private ArrayList<Artefact> artefacts = new ArrayList<Artefact>();
	public Artefact getArtefact(int i){return this.artefacts.get(i);}
	public ArrayList<Artefact> getArtefacts(){return this.artefacts;}
	public void addArtefact(Artefact a){this.artefacts.add(a);}
	public void setArtefacts(ArrayList<Artefact> a){this.artefacts = a;}

	
	/* (non-Javadoc)
	 * @see com.badlogic.gdx.ApplicationListener#create()
	 */
	@Override
	public void create() {
		this.w = Gdx.graphics.getWidth();
		this.h = Gdx.graphics.getHeight();
		this.camera = new OrthographicCamera(1, h/w);

		camera.viewportWidth=Config.WINDOW_W;
        camera.viewportHeight=Config.WINDOW_H;
        camera.update();
		this.batch = new SpriteBatch();
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.ApplicationListener#resize(int, int)
	 */
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.ApplicationListener#render()
	 */
	@Override
	public void render() {
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT); // This cryptic line clears the screen.
        batch.begin();
		for(final Artefact a:this.artefacts){a.render(batch);}
		batch.end();
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.ApplicationListener#pause()
	 */
	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.ApplicationListener#resume()
	 */
	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.ApplicationListener#dispose()
	 */
	@Override
	public void dispose() {this.artefacts.clear();}
	
	
	/**
	 * Cette methode gere la mise à jour de l'état d'une View
	 */
	public void update(){for(final Artefact a:this.artefacts){a.update();}}
	/**
	 * Cette methode gere ce qu'il peux se passer avant la mise à jour d'une View
	 */
	public void beforeUpdate(){for(final Artefact a:this.artefacts){a.beforeUpdate();}}
	/**
	 * Cette methode gere ce qu'il peux se passer apres la mise à jour d'une View
	 */
	public void afterUpdate(){for(final Artefact a:this.artefacts){a.afterUpdate();}}

}
