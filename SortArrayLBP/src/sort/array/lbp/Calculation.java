package sort.array.lbp;

public class Calculation {

	private static Calculation calculation = new Calculation();

	private Calculation() {

	}

	public static Calculation getInstance() {
		return calculation;
	}

	protected int calculateEdge(int input) {
		return 2 * input + 1;
	}
}
