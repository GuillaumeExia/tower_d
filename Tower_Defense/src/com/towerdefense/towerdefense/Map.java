package com.towerdefense.towerdefense;

import java.util.ArrayList;

import com.towerdefense.towerdefense.entities.Mob;
import com.towerdefense.towerdefense.entities.Tower;
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

	}

	public void nextWave() {

	}
}
