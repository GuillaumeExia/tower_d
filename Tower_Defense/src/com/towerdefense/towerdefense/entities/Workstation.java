package com.towerdefense.towerdefense.entities;

public class Workstation implements CanBeRepaired {

	private int healthPoints;

	public int getHealthPoints() {
		return healthPoints;
	}

	/**
	 * @see canBeRepaired#repair()
	 */
	@Override
	public void repair() {

	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

}
