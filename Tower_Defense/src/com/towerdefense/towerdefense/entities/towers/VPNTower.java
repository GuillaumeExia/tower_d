package com.towerdefense.towerdefense.entities.towers;

import com.towerdefense.towerdefense.entities.EntityType;

public class VPNTower extends Tower {
	public static String TOWER_TYPE = "hack";
	public static final int TOWER_IDENTIFIER = 2;

	public VPNTower() {
		super();
		setType(EntityType.Hack);
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
