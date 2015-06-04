public class Workstation implements canBeRepaired {

	private int healthPoints;

	public int getHealthPoints() {
		return this.healthPoints;
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
