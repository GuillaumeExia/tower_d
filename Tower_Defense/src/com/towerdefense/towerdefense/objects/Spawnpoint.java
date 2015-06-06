package com.towerdefense.towerdefense.objects;

public class Spawnpoint extends Path {
	public static int GROUND_TYPE = 2;
	public static boolean SPAWNABLE = true;

	public Spawnpoint() {
		super();
		setType(2);
		setSpawnable(SPAWNABLE);
	}

}
