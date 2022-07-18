package algorithms;

public class OptimalPath {

	public static void main(String[] args) {
		System.out.println(optimalPath(new Integer[][]{ { 1, 1, 1, 1, 5 }, { 1, 0, 0, 0, 0 }, { 2, 0, 0, 15, 0 } }));
		System.out.println(optimalPath(new Integer[][] { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } }));
	}

	public static Integer optimalPath(Integer[][] grid) {
		Integer[][] temp = new Integer[grid.length][grid[0].length];
		int rowSize = grid.length;

		for (int row = grid.length - 1; row >= 0; row--) {

			for (int col = 0; col < grid[0].length; col++) {

				if (row == rowSize - 1 && col - 1 < 0) {
					
					temp[row][col] = grid[row][col];
					
				} else if (row == rowSize - 1) {
					
					temp[row][col] = temp[row][col - 1] + grid[row][col];
					
				} else if (col == 0 && row + 1 < rowSize) {
					
					temp[row][col] = temp[row + 1][col] + grid[row][col];
					
				} else {
					
					temp[row][col] = Math.max(temp[row + 1][col] + grid[row][col], temp[row][col - 1] + grid[row][col]);
					
				}
			}
		}
		return temp[0][temp[0].length - 1];
	}
}
