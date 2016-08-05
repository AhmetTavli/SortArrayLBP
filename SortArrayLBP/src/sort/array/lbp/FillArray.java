package sort.array.lbp;

import java.awt.Point;
import java.util.ArrayList;

public class FillArray {

	private static FillArray fillarray = new FillArray();

	private FillArray() {

	}

	public static FillArray getInstance() {
		return fillarray;
	}

	protected ArrayList<Point> fillArray(int edge) {
		System.out.println("\n\t --- Generated Array ---");
		ArrayList<Point> arraylist = new ArrayList<Point>();
		for (int i = 0; i < edge; i++)
			for (int j = 0; j < edge; j++)
				arraylist.add(new Point(j, i));

		return arraylist;
	}
}
