package com.towerdefense.towerdefense;

public abstract class Mob implements canDieMoveAttack {

	private int healthPoints;

	private int damageValue;

	private int movementSpeed;

	private int rangeValue;

	private int reward;

	private EntityType type;

	private int protection;

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

	public int getDamageValue() {
		return this.damageValue;
	}

	public int getHealthPoints() {
		return this.healthPoints;
	}

	public int getMovementSpeed() {
		return this.movementSpeed;
	}

	public int getProtection() {
		return this.protection;
	}

	public int getRangeValue() {
		return this.rangeValue;
	}

	public int getReward() {
		return this.reward;
	}

	public EntityType getType() {
		return this.type;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	public void setDamageValue(int damageValue) {
		this.damageValue = damageValue;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	public void setRangeValue(int rangeValue) {
		this.rangeValue = rangeValue;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}

	public void setType(EntityType type) {
		this.type = type;
	}

}
