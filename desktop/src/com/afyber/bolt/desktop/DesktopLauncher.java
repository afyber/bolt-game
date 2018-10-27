package com.afyber.bolt.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.afyber.bolt.Bolt;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Bolt";
		config.width = 500;
		config.height = 600;
		config.resizable = false;
		config.addIcon("badlogic.jpg", Files.FileType.Internal);
		new LwjglApplication(new Bolt(), config);
	}
}