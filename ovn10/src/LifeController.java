public class LifeController {
	public static void main(String[] args) {
		
		LifeBoard board = new LifeBoard(10, 10);
		LifeView window = new LifeView(board);
		Life life = new Life(board);													// skapar  spelet Life, klassen life åberopar klassen board
		
		
		window.drawBoard();																// ritar board
		
		int command = window.getCommand();												// variabel som kontrollerar de 3 olika kommandona i window
		
			while(true) {																//så länge som följande påståenden är sanna:
				
				if(command == 1) {														// klicka i ruta
					life.flip(window.getRow(),  window.getCol());						// individ skapas vid klick i tom ruta
																						// individ raderas vid klick i fylld ruta
			}
				else if(command  ==  2) {												//klicka på next för nästa generation
					life.newGeneration();	
					
					
				}
					
				else if(command ==  3) {							// klicka på quit			// quit funkade inte för att alla if-satser inte var ifyllda
					System.exit(0);
				}
				window.update();
				
				command = window.getCommand();											// möjliggör flera klick i samma fönster
				}
			
	}

}
