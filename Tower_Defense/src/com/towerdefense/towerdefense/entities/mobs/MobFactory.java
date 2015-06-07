package com.towerdefense.towerdefense.entities.mobs;

public abstract class MobFactory {
	public static final int MOB_TYPE_AMOUNT = 4;

	public static Mob createMob(final int type) {
		if (type == Bug.MOB_IDENTIFIER) {
			return new Bug();
		} else if (type == ForkBomb.MOB_IDENTIFIER) {
			return new ForkBomb();
		} else if (type == Virus.MOB_IDENTIFIER) {
			return new Virus();
		} else if (type == Thunder.MOB_IDENTIFIER) {
			return new Thunder();
		} else if (type == WebFiltering.MOB_IDENTIFIER) {
			return new WebFiltering();
		} else {
			return null;
		}
	}

}
