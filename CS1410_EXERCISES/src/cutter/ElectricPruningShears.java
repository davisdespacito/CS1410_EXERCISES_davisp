package cutter;

/**
 * 
 */
public class ElectricPruningShears extends PruningShears {

	/**
	 * 
	 * @param size
	 */
	public ElectricPruningShears(int size) {
		super(size);
	}

	/**
	 * 
	 */
	private boolean power;

	/**
	 * Indicates whether the electric pruning shear is on or off.
	 * 
	 * @return returns On/Off status
	 */
	public boolean isOn() {

		return power;

	};

	/**
	 * Turns the electric shears on or off.
	 */
	public void onOff() {

		power = !power;

	}

	/**
	 * Returns the same string as the superclass if the power is on. If the power is
	 * off, the electric pruner cannot cut, and an empty string is returned.
	 */
	@Override
	public String cut() {

		if (isOn()) {
			return super.cut();

		} else
			return "";

	}

	/**
	 * Returns a string of the following format
	 * {string form parent class} Power: {on|off}
	 */
	@Override
	public String toString() {

		return super.toString() + " Power: " + (power ? "On" : "Off");

	}

}
