

import java.util.Scanner;

public class MainBook {

	public static void main(String[] args) {
		
		Dialog d  =  new Dialog();
		Register reg  =  new Register ();
		
		String menu = "Meny: \n" +
				  "1. Lägg till bok \n" +
				  "2. Ta bort bok efter författare \n" +
				  "3. Ta bort bok efter titel \n" +
				  "4. Visa alla böcker \n" +
				  "5. Sortera efter författare \n" +
				  "6. Sortera efter titel \n" +
				  "0. Avsluta & spara fil";
		
		reg.readFromFile("data.txt");
		
		while (true) {							
			
		
		int s = d.readInt(menu);																// skapar dialogruta
		
		switch (s) {
		
		case 1:	
			Book b = new Book(d.readString("Ange författare:"), d.readString("Ange titel:"));	// läser in strängar
			reg.addBook(b);																		// lägger till bok
			d.printString(reg.present());														// visar på skärmen
			break;
		
		case 2:
			reg.removeByAuthor(d.readString("Ange författare:"));								// anropar metoder som tar bort författare
			break;
			
		case 3:
			reg.removeByName(d.readString("Ange titel:"));										// anropar metoder som tar bort böcker efter titlar
			break;
			
		case 4:
			d.printString(reg.present());														// visar författare
			break;
		
		case 5:
			reg.sortAuthor();																	// sorterar efter författare
			break;
		
		case 6:
			reg.sortTitle();																	// sorterar efter titel
			break;
				
		case 0:
			reg.writeToFile("data.txt");														// sparar strängar i filen data
			System.exit(0);																		// avslutar programmet
			break;
			
		
		
		}	
	}
		
}
	
}