package com.doklaim.clicken.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.doklaim.clicken.Clicken;
import com.doklaim.clicken.Config;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	        config.title = "graphicsdemo";
	        config.useGL30 = true;
	        config.width = (int) Config.WINDOW_W;
	        config.height = (int) Config.WINDOW_H;
		new LwjglApplication(new Clicken(), config);
	}
}