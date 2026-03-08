package cutter;

public abstract class Cutter {
	private int size;

	/**
	 * @param size
	 */
	public Cutter(int size) {
		this.size = size;
	}

	/**
	 * Returns the value of the field size.
	 * 
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Returns a String that describes how this object cuts.
	 * 
	 * @return a description how this object cuts
	 */
	public abstract String cut();

	/**
	 * Returns a string of the following format:
	 * [name of the class] size-[size]
	 * 
	 */
	@Override
	public String toString() {
		return "Cutter size=" + size + "\"";
	}
	
	
}
