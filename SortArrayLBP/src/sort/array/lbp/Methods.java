package sort.array.lbp;

import java.awt.Point;
import java.util.ArrayList;

public class Methods {

	private int input = getInput();
	private int edge = calculateEdge();
	private static Connector connector;
	private static Methods methods = new Methods();

	private Methods() {
		initializeConnectorClass();
	}

	public static Methods getInstance() {
		return methods;
	}

	private int getInput() {
		return Connector.getInputClass();
	}

	private int calculateEdge() {
		return Connector.calculationClass(input);
	}

	public ArrayList<Point> fillArray() {
		return Connector.fillArrayClass(edge);
	}

	public ArrayList<Point> lbpSort(ArrayList<Point> arraylist) {
		return Connector.lbpSortClass(arraylist, edge);
	}

	public void displayArray(ArrayList<Point> arrayList) {
		Connector.displayArrayClass(arrayList, edge);
	}

	private void initializeConnectorClass() {
		setConnector(Connector.getInstance());
	}

	public static Connector getConnector() {
		return connector;
	}

	public static void setConnector(Connector connector) {
		Methods.connector = connector;
	}
}
