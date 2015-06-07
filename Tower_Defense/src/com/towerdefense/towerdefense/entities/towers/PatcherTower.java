package com.towerdefense.towerdefense.entities.towers;

import com.towerdefense.towerdefense.entities.EntityType;

public class PatcherTower extends Tower {
	public static String TOWER_TYPE = "error";
	public static final int TOWER_IDENTIFIER = 3;

	public PatcherTower() {
		super();
		setType(EntityType.Error);
		setIdentifier(TOWER_IDENTIFIER);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

}
