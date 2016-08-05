package sort.array.lbp;

import java.awt.Point;
import java.util.ArrayList;

public class Connector {

	private static Connector connector = new Connector();
	private static DisplayArray dispArr;
	private static GetInput getInp;
	private static Calculation calc;
	private static FillArray fArray;
	private static LBPSort lbp;

	private Connector() {

	}

	public static Connector getInstance() {
		return connector;
	}

	public static void displayArrayClass(ArrayList<Point> arraylist, int edge) {
		initializeDisplayArray(arraylist, edge);
	}

	private static void initializeDisplayArray(ArrayList<Point> arraylist, int edge) {
		DisplayArray display = DisplayArray.getInstance();
		dispArr = display;
		displayArray(arraylist, edge);
	}

	private static void displayArray(ArrayList<Point> arraylist, int edge) {
		dispArr.displayArray(arraylist, edge);
	}

	private static int initializeGetInput() {
		GetInput getInput = GetInput.getInstance();
		getInp = getInput;
		return getInput();
	}

	public static int getInputClass() {
		return initializeGetInput();
	}

	private static int getInput() {
		return getInp.getInput();
	}

	public static int calculationClass(int input) {
		return initializeCalculation(input);
	}

	private static int initializeCalculation(int input) {
		Calculation calculation = Calculation.getInstance();
		calc = calculation;
		return getCalculatedEdge(input);
	}

	private static int getCalculatedEdge(int input) {
		return calc.calculateEdge(input);
	}

	public static ArrayList<Point> fillArrayClass(int edge) {
		return initializeFillArray(edge);
	}

	private static ArrayList<Point> initializeFillArray(int edge) {
		FillArray fillarray = FillArray.getInstance();
		fArray = fillarray;
		return getFilledArray(edge);
	}

	private static ArrayList<Point> getFilledArray(int edge) {
		return fArray.fillArray(edge);
	}

	public static ArrayList<Point> lbpSortClass(ArrayList<Point> arraylist, int edge) {
		return initializeLBPSort(arraylist, edge);
	}

	private static ArrayList<Point> initializeLBPSort(ArrayList<Point> arraylist, int edge) {
		LBPSort lbpSort = LBPSort.getInstance();
		lbp = lbpSort;
		return lbpSort(arraylist, edge);
	}

	private static ArrayList<Point> lbpSort(ArrayList<Point> arraylist, int edge) {
		return lbp.sortArrayLBP(arraylist, edge);
	}
}
