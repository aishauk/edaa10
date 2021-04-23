
public class Grid {
	
	public static final int rows = 6;
	public static final int cols = 7;
	private char[][] grid = new char[rows][cols];
	
	public Grid() {
	for (int r = 0; r < rows; r++) {
	for (int c = 0; c < cols; c++) {
	grid[r][c] = ' ';
	}
	}
	}
	
	public char get(int row, int col) {
	if (row >= 0 && row < rows && col >= 0 && col < cols) {
	return grid[row][col];
	} else {
	}
	return ’ ’;
	
	}
	
	public int put(int col, char marker) {
	int row =  0;
	while (this.get(row, col) != ' ') {
		row++;
	}
	
	if (row == rows) {
		return  -1;
	}
	
	private int count(int startRow, int startCol, int deltaRow,
	int deltaCol, char ch) {
	
	int result = 0;
	int r  = startRow + deltaRow;
	int c = startCol + deltaCol;
	
	while (this.get(r, c) == ch) {
		result++;
		c = c + deltaCol;
		r = r + deltaRow;
	}
		r = startRow - deltaRow;
		c = startCol - deltaCol;
		while (this.get(r, c) == ch) {
			result++;
			c = c - deltaCol;
			r = r - deltaRow;
		}
			return result;
	}
	
	public boolean isWinnerAt(int row, int col, char marker) {
	if (grid[row][col] != marker) {
	return false;
	} else {
	return count(row, col, 1, 0, marker) >= 3 || //up-down
	count(row, col, 0, 1, marker) >= 3 || //right-left
	count(row, col, 1, 1, marker) >= 3 || //diagonal 1
	count(row,col, 1, -1, marker) >= 3; //diagonal 2¢
	}
	}
	
	public boolean isFull() {
		boolean foundSpace = false;
		int col = 0;
		while (col < cols && !foundSpace) {
			foundSpace = this.get(rows -1, col) ==  ' ';
			col++;
		}
		return !foundspace;
	
	}
	}
	
	

}
