public class Card {
	public static final int SPADES = 1;
	public static final int HEARTS = SPADES + 1;
	public static final int DIAMONDS = SPADES + 2;
	public static final int CLUBS = SPADES + 3;
	private int rank;	// val�r
	private int suit;   // f�rg
	
	/** Skapar ett spelkort med f�rgen suit (SPADES, HEARTS, DIAMONDS, CLUBS) 
	    och val�ren rank (1-13) */
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/** Tar reda p� f�rgen */
	public int getSuit() {
		return suit;
	}

	/** Tar reda p� val�ren */
	public int getRank() {
		return rank;
	}

	/** Returnerar en l�sbar representation av kortet, t ex "spader ess" */
	public String toString(){
		String suitString = "";		
		switch(suit) {
			case SPADES: suitString = "spader"; break;
			case HEARTS: suitString = "hj�rter"; break;
			case DIAMONDS: suitString = "ruter"; break;
			case CLUBS: suitString = "kl�ver"; break;
		}
		String rankString = "";
		switch(rank) {
			case 1: rankString = "ess"; break;
			case 11: rankString = "knekt"; break;
			case 12: rankString = "dam"; break;
			case 13: rankString = "kung"; break;
			default: rankString = String.valueOf(rank);
		}
		return suitString + " " + rankString;
	}
}