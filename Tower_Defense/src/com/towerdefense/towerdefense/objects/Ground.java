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
}
