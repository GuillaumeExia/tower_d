package com.towerdefense.towerdefense.entities;

public abstract class Tower {

	private int cost;

	private int damageValue;

	private int reloadCooldown;

	private int rangeValue;

	private int healthPoints;

	private EntityType damageType;

	public int getCost() {
		return this.cost;
	}

	public EntityType getDamageType() {
		return this.damageType;
	}

	public int getDamageValue() {
		return this.damageValue;
	}

	public int getHealthPoints() {
		return this.healthPoints;
	}

	public int getRangeValue() {
		return this.rangeValue;
	}

	public int getReloadCooldown() {
		return this.reloadCooldown;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setDamageType(EntityType damageType) {
		this.damageType = damageType;
	}

	public void setDamageValue(int damageValue) {
		this.damageValue = damageValue;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void setRangeValue(int rangeValue) {
		this.rangeValue = rangeValue;
	}

	public void setReloadCooldown(int reloadCooldown) {
		this.reloadCooldown = reloadCooldown;
	}

}
