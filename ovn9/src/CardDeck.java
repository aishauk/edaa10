import java.util.Random;

public class CardDeck {

	private Card[] card;					// skapar en vektor med kort
	private int index;						// plats i vektorn
	private static Random rand = new Random();

	/**  Skapar en CardDeck */
	CardDeck() {
		
		card = new Card[52];			// skapar vektorn med 52 platser, en plats för varje kort
		index = 0;						// börjar med första platsen i vektorn
		
		// går igenom kortens egenskaper
		
		// 4 olika typer av kort, spader, hjärter, diamant och klöver. 13 kort för varje typ.
		
		//for-loop som går igenom de 4 typerna av kort (suits)
		
		for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for (int rank = 1; rank < 14; rank++) {					// for-loop som går igenom de 13 olika valörerna
				card[index] = new Card(suit, rank); 			// går igenom alla korten med typ och valör
				index++;									// går igenom alla platser i vektorn
			}
		}
	
		
	
	}
	
	/** Blandar kortleken */
	void  shuffle() {
		// vill blanda mina kort 52 ggr
		
		for(int i = 51; i > 0; i--) {				// blandar mina kort, börjar på 51 och går ner till 0
			int place1 =  rand.nextInt(i);		//lägger till 1 eftersom random skapar från 0-50
			Card cards = card[place1];					// skapar ett nytt kort där jag lägger in värdet i
			card[place1] = card[i];					// byter plats på första och andra kortet
			card[i]  =  cards;					// byter  plats på andra och första kortet
		}
		
		index = 52;									// 51 platser i min blandning
		
	}
	
	/** Undersöker om det finns fler kort i kortleken */
	boolean moreCards() {
		return index>0;
		
	}
	
	/** Drar det översta kortet i leken */
	Card getCard() {
		
		index--;					// kortleken minskar för varje gång jag tar upp ett kort
		return card[index];
		
	}
}
