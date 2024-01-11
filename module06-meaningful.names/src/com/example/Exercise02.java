package com.example;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {

	private static final int FLAGGED = 0;
	private static final int STATUS_VALUE = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<int[]> getFlaggedCells() {
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for (int[] cell : flaggedCells)
			if (cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(cell);
		return flaggedCells;
	}
}
