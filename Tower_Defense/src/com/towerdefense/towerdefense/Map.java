package com.towerdefense.towerdefense;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import com.towerdefense.towerdefense.database.DataBase;
import com.towerdefense.towerdefense.entities.mobs.Mob;
import com.towerdefense.towerdefense.entities.mobs.MobFactory;
import com.towerdefense.towerdefense.entities.towers.Tower;
import com.towerdefense.towerdefense.objects.Ground;

public class Map {
	private int width = 10;
	private int height = 10;
	private String name = "DEFAULT";
	private int id = -1;
	private int wave = 0;
	// private Ground[][] terrain;
	private ArrayList<Ground> grounds;
	private ArrayList<Tower> towers;
	private ArrayList<Mob> mobs;
	private DataBase database;

	public Map() {
		super();
	}

	public Map(String name, int width, int height, int id) {
		initialization(name, width, height, id);

	}

	public void drawTerrain(Graphics g) {
		fetchTerrain();
		for (Ground ground : grounds) {
			g.drawImage(ground.getImage(), ground.getX() * 32,
					ground.getY() * 32, null);
		}
	}

	public void fetchTerrain() {
		if (grounds == null) {
			grounds = database.mapSelection(id);
		}
	}

	public int getHeight() {
		return height;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Mob getRandomMob() {
		Random random = new Random();
		return MobFactory.createMob(random
				.nextInt(MobFactory.MOB_TYPE_AMOUNT + 1));
	}

	public int getWidth() {
		return width;
	}

	private void initialization(String name, int width, int height, int id) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.id = id;
		database = new DataBase();
		mobs = new ArrayList<Mob>();
	}

	public void nextWave() {

		wave++;
	}

	public boolean spawnMob(final int choice) {
		if (choice == -1) {
			mobs.add(getRandomMob());
			return true;
		} else if ((choice <= MobFactory.MOB_TYPE_AMOUNT) && (choice >= 0)) {
			mobs.add(MobFactory.createMob(choice));
			return true;
		} else {
			return false;
		}
	}

	public void spawnMobs() {

	}
}
