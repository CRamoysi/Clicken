package com.doklaim.clicken.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.doklaim.clicken.Clicken;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	        config.title = "graphicsdemo";
	        config.useGL30 = true;
	        config.width = 480;
	        config.height = 600;
		new LwjglApplication(new Clicken(), config);
	}
}