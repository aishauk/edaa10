
public class Life {

	private LifeBoard board;	// skapar ett life-spel med spelplanen board, hämtar från lifeboard




	/** Skapar ett Life-spel med spelplanen board */
	public Life (LifeBoard  board) {

		this.board = board;				//skapar rutnät i konstruktor
	}



	/** Skapar en ny generation */
	public void newGeneration() {
		board.increaseGeneration();
		int nbr= 0;																// antal grannar

		boolean[][] temp = new boolean[board.getRows()][board.getCols()];		// skapar en hjälpmatris som sparar nästa generation

		for(int c = 0; c < board.getCols(); c++) {								// går igenom alla kolumner
			for (int r = 0; r < board.getRows(); r++) {							// går igenom alla rader

				nbr = getNeighbours(board, r, c);								// (r,c) hämtar grannarnas plats
				if(board.get(r, c) == true) {
					if (nbr >= 4 || nbr < 2) {										// om fler än 4 grannar, eller mindre än två
						temp[r][c] = false;									// då dör individen

					}			 else {

						temp[r][c] = true;	// annars lever den vidare



					}



				} else {
					if(nbr == 3) {
						temp[r][c] = true;
					} 

				}
			}
		}
						for(int r = 0; r < board.getRows(); r++) {				//uppdaterar hjälpmatrisen till riktiga matrisen
							for(int c = 0; c < board.getCols(); c++) {
								board.put(r, c, temp[r][c]);
							}
						}

		
	}



	/* Tar reda på antal grannar till ruta row, col i rutnätet board */
	private int  getNeighbours(LifeBoard  board, int row, int col)  {
		int nbr = 0;															// antalet  grannar från början är 0, deklareras här eftersom den är specifik för  metoden
		for(int col1 = col-1; col1 <= (col+1); col1++) {					// for-loop som kontrollerar grannar vertikalt (kolumner)
			for(int row1 = row-1; row1 <= (row+1);  row1++) {				// for-loop som kontrollerar grannar horistonellt (rader)
				if(board.get(row1, col1) == true) {							// om en ruta är ifylld
					nbr++;													// räknar den antalet grannarna  (uppåt)
				}
			}
		}

		if (board.get(row, col) == true) {									// om jag upptäcks
			return --nbr;													// räkna bort mig //--nbr innebär att man måste räkna ner först innan man skriver ut värdet
		} else {
			return nbr;														// upptäcks jag inte  så skriv ut antalet grannar
		}
	}

	/** Ändrar innehållet i rutan med index row, col från individ  till tom eller tvärtom */
	void flip(int row, int col) {
		if(board.get(row, col) == true) {			// om rutan är ifylld
			board.put(row, col, false);				// så blir den tom efter ett klick
		}   else {									// annars, om rutan är tom
			board.put(row, col, true);				// blir den ifylld
		}

	}






}
