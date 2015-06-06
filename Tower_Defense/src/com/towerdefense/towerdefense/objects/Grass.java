package com.towerdefense.towerdefense.objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Grass extends Ground {
	public static int GROUND_TYPE = 0;
	public static boolean CONSTRUCTIBLE = false;
	public static boolean WALKABLE = false;
	public static boolean SPAWNABLE = false;

	public Grass() {
		super();
		try {
			setImage(ImageIO.read(new File("res/images/terrain/grass.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setType(GROUND_TYPE);
		setConstructible(CONSTRUCTIBLE);
		setWalkable(WALKABLE);
		setSpawnable(SPAWNABLE);

	}

}