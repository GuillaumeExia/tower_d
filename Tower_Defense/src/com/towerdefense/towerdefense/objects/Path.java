package com.towerdefense.towerdefense.objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Path extends Ground {
	public static int GROUND_TYPE = 1;
	public static boolean CONSTRUCTIBLE = false;
	public static boolean WALKABLE = true;
	public static boolean SPAWNABLE = false;

	public Path() {
		super();
		try {
			setImage(ImageIO.read(new File("res/images/terrain/path.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setType(GROUND_TYPE);
		setConstructible(CONSTRUCTIBLE);
		setWalkable(WALKABLE);
		setSpawnable(SPAWNABLE);

	}
}
