/**
 * 
 */
package sort.array.lbp;

import java.awt.Point;
import java.util.ArrayList;

/**
 * @author Ahmet Tavlý
 *
 */
public class DisplayArray {

	private static DisplayArray displayarray = new DisplayArray();
	private int edge;

	private DisplayArray() {

	}

	public static DisplayArray getInstance() {
		return displayarray;
	}

	protected void displayArray(ArrayList<Point> arraylist, int edge) {
		this.edge = edge;
		for (int i = 0; i < arraylist.size(); i++) {
			String string = isEdge(i) ? "\n(%d, %d) " : "(%d, %d) ";
			printfArray(string, arraylist.get(i).x, arraylist.get(i).y);
		}
	}

	private boolean isEdge(int i) {
		return (i != 0) ? (i % edge == 0) ? true : false : false;
	}

	private void printfArray(String string, int input0, int input1) {
		System.out.printf(string, input0, input1);
	}
}
