
public class Board {
	
	private int[][] sq;
	private int r, c;			//skapar koordinater
	private int step = 0;
	
	

	/** Skapar ett rutnät av storlek 5*5 för slumpmässig promenad */
	Board() {
		sq = new int[5+2][5+2];
		
		for (int i = 0; i < 7; i++) {			// går igenom rader
			sq[i][6] = -1;						// sätter värde i  första vektorn eftersom den går igenom raderna (horisontellt)
			sq[i][0] = -1;
		}
		
		for (int k = 0; k < 7; k++) {			// går igenom kolumner
			sq[6][k] = -1;						// sätter värde i andra vektorn eftersom den går igenom kolumnerna  (vertikalt)
			sq[0][k] = -1;
		}
		
		
	}
	
	/** gör rutan row, col till aktuell ruta */
	void setStartPosition(int row, int col) {
		r = row+1;			// måste fråga om detta
		c = col+1;
		
	}
	
	/** kontrollerar om det är möjligt att gå till någon av de fyra grannrutorna,
	 * dvs ger true om någon av dessa rutor är obesökta, false annars */
	boolean possibleToMove() {
		
		return false;
		
	}
	
	/** går till en slumpmässigt vald grannruta. Det förutsätts att det finns
	 * minst en grannruta som inte är besökt */
	void makeOneStep() {
		
	}
	 
	/** skriver ut rutnätet */
	void print() {
		
	}
}
