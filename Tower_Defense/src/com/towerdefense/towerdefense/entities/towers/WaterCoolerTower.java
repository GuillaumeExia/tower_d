package com.towerdefense.towerdefense.entities.towers;

import com.towerdefense.towerdefense.entities.EntityType;

public class WaterCoolerTower extends Tower {
	public static String TOWER_TYPE = "heat";
	public static final int TOWER_IDENTIFIER = 0;

	public WaterCoolerTower() {
		super();
		setType(EntityType.Heat);
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
