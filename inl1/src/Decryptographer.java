import se.lth.cs.p.inl1.nbr2.Key;

public class Decryptographer {
	
	Key key;					// skapar en ny key
	
	
	
	/** Skapar ett objekt för dechiffrering där nyckeln key används */ 
	Decryptographer(Key key)  {
		
		this.key = key;
	
	}
	
	
	
	/** Dechiffrerar texten text och returnerar klartexten */ 
	String decrypt(String text) {
		char letter;
		String finalString = "";					// slutliga klartexten
		int start = key.getStart();					// deklarerar nyckelns startläge
		int k ;										// variabel för bokstavens startläge i vanliga alfabetet
		StringBuilder sb  = new StringBuilder();					// skapar en stringbuilder som kan modifieras, bygger upp textsträngar av olika variabler
						
		// loopen går igenom  alla tecken i min krypterade text  			
		for(int i = 0; i < text.length(); i++) {			// for-loop för att gå igenom hela texten				
			letter = text.charAt(i);						// ger bokstaven på platsen 0,1,2,3.....
			if(letter == ' ') {								// om det är ett blanktecken så ska det vara ett blanktecken
				sb.append(' ');								// sparar blanksteg i  en stringBuilder
			} else {
				int index=0;
				start=start%26;								// vi behöver endast  26 värden
				key.getStart();

				
				while(index<26 &&(letter!=key.getLetter(index))) {		// så länge som chiffret inte motsvarar förskjutningen
					index++;											// så fortsätter den leta
				} 
				
				k=index-start;
				
				if(k>=0)
					letter=(char)('A'+k);
				else   letter=(char)('Z'-(start-1-index));				// räknar från index, om index mindre än start så räknar den bakåt
																		// så att det inte blir tokigt mellan Z och A.
				
				sb.append(letter);										//lagrar bokstav i stringBuilder
				start++;												//chiffret börjar om
				
			}
						
		
			}
		return  sb.toString();										// returnerar sluttexten
		}
}
	








		
		
//int index = letter-'A'; 					// bokstavens plats i alfabetet
//letter = (char)(index +'A');				// index==2 ger letter = c
//index = index%26;							// vill bara ha 26 bokstäver
//finalString += key.getLetter(index);  		// hämtar bokstav inom min index	
		 
	
		
		/** int index  =key.getLetter(0) -'A';
		int start =  key.getStart();
		
		for (int i = 0; i < text.length(); i++)  {
			char letter = text.charAt(i);		
			if (letter == ' ') {
				sb.setCharAt(i, ' ');
			} else if (start == 4) {
				index =  index+start;
				start++;
				
				
				
			}
			
		} */
		
	
//	while (letter != key.getLetter(k)) {		// while-loop för att jämföra första bokstaven i chifferalfabetet med vanliga alfabetet
//	k++;	
//	}

//		if(letter == key.getLetter(k)) {						// när bokstaven i chifferkoden motsvarar bokstav i  alfabetet
//			index -= 4;								// då går vi tillbaka 4 steg i alfabetet
//			start--;										// och minskar med 1 för varje bokstav
//		}
		
		
	
	
//for(char letter:text.toCharArray()) {  
	
	

	
	

