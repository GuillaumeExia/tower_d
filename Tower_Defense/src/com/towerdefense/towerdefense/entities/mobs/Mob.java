package com.towerdefense.towerdefense.entities.mobs;

import com.towerdefense.towerdefense.entities.CanMove;
import com.towerdefense.towerdefense.entities.Entity;

public abstract class Mob extends Entity implements CanMove {

	private int movementSpeed;
	private int reward;
	private int protection;
	private int direction;

	public Mob() {
		super();
		// TODO Auto-generated constructor stub
	}

}
