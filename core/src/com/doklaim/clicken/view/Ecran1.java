package com.doklaim.clicken.view;

import com.doklaim.clicken.Artefact;
import com.doklaim.clicken.View;
import com.doklaim.clicken.artefact.Ship;

public class Ecran1 extends View {

	public Ecran1() {
		
	}
	
	@Override
	public void create() {
		super.create();
		
		this.addArtefact(new Ship());
		
		
		
		
		
		
		
		
		
		for(final Artefact a:this.getArtefacts()){
			a.create(this);
		}
	}




	
}
