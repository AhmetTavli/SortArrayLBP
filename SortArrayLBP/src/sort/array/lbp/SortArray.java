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
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Methods methods = Methods.getInstance();
		ArrayList<Point> arrayList = methods.fillArray();
		methods.displayArray(arrayList);
		ArrayList<Point> sortedList = methods.lbpSort(arrayList);
		methods.displayArray(sortedList);
	}

}
