import java.util.Scanner;
public class GuessNumber {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv in ditt minimala värde: ");
		int min = scan.nextInt();									// läser in min-tal
		System.out.println("Skriv in ditt maximala värde: ");
		int max = scan.nextInt();									// läser in max-tal
		NumberGenerator nbrGen = new NumberGenerator(min, max);		// skapar en ny numberGenerator
		int antalGissningar = 1;									// räknar antalet gissningar
		nbrGen.drawNbr();											// drar ett nytt hemligt tal i intervallet max-min
		System.out.print("Gissa ett tal: ");
		int guess = scan.nextInt();									// användaren skriver in sin gissning
		
		while (!nbrGen.isEqual(guess)) {							// så länge användaren gissar fel
			antalGissningar++;										// pågår while-satsen
			if (nbrGen.isBiggerThan(guess)) {
				System.out.println("För lågt, gissa igen");
			} else {
				System.out.println("För högt, gissa igen");
			}
			guess = scan.nextInt();
		}
		System.out.println("Du gissade rätt! Antal gissningar var: " + antalGissningar);
		
	}
		
}