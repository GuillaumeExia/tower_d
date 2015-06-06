package com.towerdefense.towerdefense;

import java.util.ArrayList;

import com.towerdefense.towerdefense.entities.mobs.Mob;
import com.towerdefense.towerdefense.entities.towers.Tower;
import com.towerdefense.towerdefense.objects.Grass;
import com.towerdefense.towerdefense.objects.Ground;

public class Map {
	private int width;
	private int height;
	private int wave;
	private Ground[][] terrain;
	private ArrayList<Tower> towers;
	private ArrayList<Mob> mobs;

	public Map() {
		initialization(12, 12, 1);
	}

	private void initialization(int width, int height, int id) {
		this.width = width;
		this.height = height;
		terrain = new Ground[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				terrain[i][j] = new Grass();
			}
		}
		if (terrain[5][9].getType() == 0) {
			System.out.println("good");
		}
	}

	public void nextWave() {

	}
}
