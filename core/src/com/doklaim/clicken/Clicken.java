package com.doklaim.clicken;

import com.badlogic.gdx.ApplicationAdapter;
import com.doklaim.clicken.view.Ecran1;

public class Clicken extends ApplicationAdapter {
	View v = new Ecran1();
	
	@Override
	public void create () {
		v.create();
	}

	@Override
	public void render () {
		v.beforeUpdate();
		v.update();
		v.afterUpdate();
		v.render();
	}
}
