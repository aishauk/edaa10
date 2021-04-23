public class LifeBoard {
	
	
	private int rows;
	private int cols;
	private int generation;
	private boolean[][] spelplan;							// boolean eftersom värdena kan antingen synas eller ej (true/false)		

	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	    b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1. */	
	public LifeBoard(int rows, int cols) {
		
		this.rows = rows;							// skapar rader
		this.cols = cols;							// skapar kolumner
		spelplan = new  boolean [rows][cols];		// skapar ett matris med rader & kolumner i vektor
		generation = 1;
		
		
	}

	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col �r utanf�r spelplanen returneras false */
	public boolean get(int row, int col) {
		if (row >= rows || col >= cols || row < 0 || col < 0) {			// om man trycker på en ruta utanför matrisen registreras inte detta värde
			return false;
		}
		else if (spelplan[row][col] == true) {							//om individ finns i spelplan med row, col är det sant
			return true;
		} else {				
			return false;												// annars falskt
		}
	}

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		
		spelplan [row][col] = val;									// värdet val tilldelas spelplanet med vektorerna row, col
		
		
	}

	/** Tar reda p� antalet rader */
	public int getRows() {
		
		return rows;
		
	}

 	/** Tar reda p� antalet kolonner */
	public int getCols() {
		
		return cols;
		
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		
		return generation;
		
	}

	/** �kar generationsnumret med ett */
	public void increaseGeneration() {
		
		generation++;
		
	}
}