package com.towerdefense.towerdefense.entities.towers;

import com.towerdefense.towerdefense.entities.EntityType;

public class FireWallTower extends Tower {
	public static String TOWER_TYPE = "viral";
	public static final int TOWER_IDENTIFIER = 1;

	public FireWallTower() {
		super();
		setType(EntityType.Viral);
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
