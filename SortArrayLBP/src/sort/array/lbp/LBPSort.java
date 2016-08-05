package sort.array.lbp;

import java.awt.Point;
import java.util.ArrayList;

public class LBPSort {

	private static LBPSort lbpsort = new LBPSort();

	public static LBPSort getInstance() {
		return lbpsort;
	}

	protected ArrayList<Point> sortArrayLBP(ArrayList<Point> inputArray, int edge) {
		System.out.println("\n\n\n\t --- LBP Sort --- \n");
		ArrayList<Point> resultArray = new ArrayList<Point>();
		int index = -1;
		int x;
		int y;
		int radius = (edge - 1) / 2;
		for (int i = 0; i < radius; i++) {
			for (int j = 0; j < edge - 2 * i; j++) {
				index += 1;
				x = inputArray.get(index).x;
				y = inputArray.get(index).y;
				resultArray.add(new Point(x, y));
			}

			for (int j = 0; j < edge - 2 * i - 1; j++) {
				index += edge;
				x = inputArray.get(index).x;
				y = inputArray.get(index).y;
				resultArray.add(new Point(x, y));
			}

			for (int j = 0; j < edge - 2 * i - 1; j++) {
				index -= 1;
				x = inputArray.get(index).x;
				y = inputArray.get(index).y;
				resultArray.add(new Point(x, y));
			}

			for (int j = 0; j < edge - 2 * i - 2; j++) {
				index -= edge;
				x = inputArray.get(index).x;
				y = inputArray.get(index).y;
				resultArray.add(new Point(x, y));
			}
		}
		index += 1;
		x = inputArray.get(index).x;
		y = inputArray.get(index).y;
		resultArray.add(new Point(x, y));
		System.out.printf("\n\tCenter Value Index : %d \n", index);
		return resultArray;
	}
}
