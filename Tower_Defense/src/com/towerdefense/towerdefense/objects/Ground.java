package com.towerdefense.towerdefense.objects;

import java.awt.Image;

public abstract class Ground {
	private Image image;
	private int type;
	private boolean constructible;
	private boolean walkable;
	private boolean spawnable;

	public Ground() {
		super();
	}

	public Image getImage() {
		return image;
	}

	public int getType() {
		return type;
	}

	public boolean isConstructible() {
		return constructible;
	}

	public boolean isSpawnable() {
		return spawnable;
	}

	public boolean isWalkable() {
		return walkable;
	}

	public void setConstructible(boolean constructible) {
		this.constructible = constructible;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void setSpawnable(boolean spawnable) {
		this.spawnable = spawnable;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setWalkable(boolean walkable) {
		this.walkable = walkable;
	}
}
