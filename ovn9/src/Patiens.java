//import java.util.Scanner;

public class Patiens {

	public static void main(String[] args) {
		
		
		
		CardDeck cd = new CardDeck();
		int k = 1000000;
		int nbr = 1;
		int gameOver = 0;

		
		/** Loop som lägger ut patiensen */
		
		for (int  i = 0; i < k; i++) {
			cd.shuffle();										// blandar kortleken
			while(cd.moreCards()) {								//så länge det finns kort körs spelet
			Card c = cd.getCard();
				if(c.getRank() == nbr) {					// kontrollerar om valör och numret användaren ropar ut är samma
				gameOver++;									// räknar antalet gånger man förlorar
				break;
			}
			nbr++;
			
				if(nbr >= 4) {
					nbr = 1;							// kör om spelet när anv säger 4
				}
			
		}
			
			
		}
		
		double sannolikhet = (k-(gameOver)) / (double) k;
		System.out.println(sannolikhet);
		
		

	}

}
