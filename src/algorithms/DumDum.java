package algorithms;

public class DumDum {
	
	public static void main(String[] args) {
		System.out.println(optimalPath(new Integer[][]{ { 1, 1, 1, 1, 5 }, { 1, 0, 0, 0, 0 }, { 2, 0, 0, 15, 0 } }));
		System.out.println(optimalPath(new Integer[][] { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } }));
	}

	public static Integer optimalPath(Integer[][] grid) {
		int rowSize = grid.length;
		Integer [][] res = new Integer[rowSize][grid[0].length];
		
		for(int row = rowSize - 1; row >= 0 ; row--) {
			
			for(int col = 0; col < grid[0].length; col++) {
				
				if(row == rowSize - 1 && col - 1 < 0) {
					res[row][col] = grid[row][col];
				}
				else if(row == rowSize -1) {
					res[row][col] = res[row][col - 1] + grid[row][col];
				}
				else if(col == 0 && row + 1 < rowSize) {
					res[row][col] = res[row + 1][col] + grid[row][col];
				}
				else {
					res[row][col] = Math.max(res[row + 1][col] + grid[row][col], res[row][col - 1] + grid[row][col]);
				}
			}
		}
		return res[0][res[0].length - 1];
	}
}
