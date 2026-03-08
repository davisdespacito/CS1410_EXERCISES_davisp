package cutter;

public class CutterApp {

	public static void main(String[] args) {

		Pliers sideCutter = new Pliers(6, PliersType.SIDE_CUTTER);
		Pliers endNipper = new Pliers(11, PliersType.END_NIPPER);
		Pliers flushCutter = new Pliers(5, PliersType.FLUSH_CUTTER);

		PruningShears shears = new PruningShears(9);
		ElectricPruningShears eShears1 = new ElectricPruningShears(11);
		ElectricPruningShears eShears2 = new ElectricPruningShears(12);
		
		Cutter[] cutters = {sideCutter, endNipper, flushCutter, shears,
				eShears1, eShears2};
		for (Cutter c : cutters) {
			
			System.out.println(c + ":");
			System.out.println("Size = " + c.getSize());
			System.out.println(c.cut());
			System.out.println();
		}

	}

}
