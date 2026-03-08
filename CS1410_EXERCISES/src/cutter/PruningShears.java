package cutter;

public class PruningShears extends Cutter {

	public PruningShears(int size) {
		super(size);
	}

	@Override
	public String cut() {
		return "pruning";
	}

}
