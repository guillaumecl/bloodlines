package org.bloblines.test;

import org.bloblines.data.life.blob.Blob;
import org.bloblines.data.life.plant.Cucumber;
import org.bloblines.data.life.plant.Potato;
import org.bloblines.data.world.Area;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a world with a few area
		Area world = new Area();

		// Create some living things
		new Potato(world);
		new Potato(world);
		new Cucumber(world);
		new Blob(null, null, world); 
		new Blob(null, null, world); 
		new Blob(null, null, world);
		
		// world.launch();
		
	}

}