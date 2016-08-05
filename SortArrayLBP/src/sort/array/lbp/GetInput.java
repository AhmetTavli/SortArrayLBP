package sort.array.lbp;

import java.util.Scanner;

public class GetInput {

	private static GetInput getInput = new GetInput();
	private Scanner sc;

	private GetInput() {

	}

	public static GetInput getInstance() {
		return getInput;
	}

	protected int getInput() {
		sc = new Scanner(System.in);
		System.out.print("Secondary Neighbor Radius (r2) : ");
		int input = sc.nextInt();
		System.out.println("\n");
		return input;
	}
}
