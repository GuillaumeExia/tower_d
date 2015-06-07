package com.towerdefense.towerdefense.entities.towers;


public class TowerFactory {

	public static final int TOWER_TYPE_AMOUNT = 3;

	public static Tower createTower(final int type) {
		if (type == WaterCoolerTower.TOWER_IDENTIFIER) {
			return new WaterCoolerTower();
		} else if (type == FireWallTower.TOWER_IDENTIFIER) {
			return new FireWallTower();
		} else if (type == VPNTower.TOWER_IDENTIFIER) {
			return new VPNTower();
		} else if (type == PatcherTower.TOWER_IDENTIFIER) {
			return new PatcherTower();
		} else {
			return null;
		}
	}
}
