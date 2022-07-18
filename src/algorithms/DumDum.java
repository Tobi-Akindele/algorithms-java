package algorithms;

public class DumDum {
	
	public static void main(String[] args) {
		System.out.println(optimalPath(new Integer[][]{ { 1, 1, 1, 1, 5 }, { 1, 0, 0, 0, 0 }, { 2, 0, 0, 15, 0 } }));
		System.out.println(optimalPath(new Integer[][] { { 0, 0, 0, 0, 5 }, { 0, 1, 1, 1, 0 }, { 2, 0, 0, 0, 0 } }));
	}

	public static Integer optimalPath(Integer[][] grid) {
		int rowL = grid.length;
		int colL = grid[0].length;
		Integer[][] r = new Integer[rowL][colL];
		
		for(int row = rowL - 1; row >= 0; row--) {
			
			for(int col = 0; col < colL; col++) {
				
				if(row == rowL - 1 && col - 1 < 0) {
					r[row][col] = grid[row][col];
				}
				else if(row == rowL - 1) {
					r[row][col] = r[row][col - 1] + grid[row][col];
				}
				else if(col == 0 && row + 1 < rowL) {
					r[row][col] = r[row + 1][col] + grid[row][col];
				}
				else {
					r[row][col] = Math.max(r[row + 1][col] + grid[row][col], r[row][col - 1] + grid[row][col]);
				}
			}
			
		}
		return r[0][r[0].length - 1];
	}
}
