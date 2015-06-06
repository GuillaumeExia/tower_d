package com.towerdefense.towerdefense;

import java.util.ArrayList;

import com.towerdefense.towerdefense.database.DataBase;
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
	private int spawnRate = 1;
	private DataBase database;

	public Map() {
		initialization(12, 12, 1);
	}

	private void initialization(int width, int height, int id) {
		database = new DataBase();
		this.width = width;
		this.height = height;
		terrain = new Ground[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				terrain[i][j] = new Grass();
			}
		}
		towers = new ArrayList<Tower>();
		mobs = new ArrayList<Mob>();

	}

	public void nextWave() {

	}
}
