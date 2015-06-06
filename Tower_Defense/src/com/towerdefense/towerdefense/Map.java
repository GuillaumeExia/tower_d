package com.towerdefense.towerdefense;

import java.util.ArrayList;

public class Map {
	private int width;
	private int height;
	private Ground[][] terrain;
	private ArrayList<Tower> towers;
	private ArrayList<Mob> mobs;

	public Map() {

	}

	private void initialization(int width, int height, int id) {
		this.width = width;
		this.height = height;
	}
}
