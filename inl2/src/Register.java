


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Register {
	
	private ArrayList<Book> reg; 								// registret skall lagras i en ArrayList
	
	//s.213, skapa en ny ArrayList
	/** Skapar ett tomt register */
	public Register () {
		reg = new ArrayList<Book>();
	}
	
	/** Sortera listan efter författare */
	public void sortAuthor() {
		
		ArrayList<Book> temp = new ArrayList<Book>();				// skapar en ny arrayList
		boolean [] help = new boolean[reg.size()];					// skapar en hjälpvektor som kommer ihåg vilka värden som plockats ut
		
		int index = 0;
		
		for (int k = 0; k < reg.size(); k++) {					// går igenom hela listan över böcker
			Book min = new Book("zzzz","zzzzz");				// stort värde för att kunna jämföra med alla strängar i listan
			for (int j = 0; j < reg.size(); j++) {				//for-loop går igenom hela listan
				//om den inte har  hittat boken
				if (help[j] == false && reg.get(j).getAuthor().toLowerCase().compareTo(min.getAuthor().toLowerCase()) < 0) {	// jämför en bok med book min
					index = j;																									// går till platsen j i vektorn
					min = reg.get(j);																							// min tilldelas minsta värdet
					
				}
				 
				
			}
			
			help [index] = true;				// när den har har hittat minsta boken markerar den bokens plats i vektorn med true
			temp.add(min);						// sparar minsta boken i arrayList
			
		}
		
		reg.clear();
			for (int i = 0; i < temp.size(); i++) {
				reg.add(temp.get(i));
				
			}
			
		
	}

	
	/** Sortera listan efter titel */
	public void sortTitle() {
			
			ArrayList<Book> temp = new ArrayList<Book>();				// skapar en ny arrayList
			boolean [] help = new boolean[reg.size()];					// skapar en hjälpvektor som kommer ihåg vilka värden som plockats ut
			
			int index = 0;
			
			for (int k = 0; k < reg.size(); k++) {					// går igenom hela listan över böcker
				Book min = new Book("zzzz","zzzzz");				// stort värde för att kunna jämföra med alla strängar i listan
				for (int j = 0; j < reg.size(); j++) {				//for-loop går igenom hela listan
					if (help[j] == false && reg.get(j).getTitle().toLowerCase().compareTo(min.getTitle().toLowerCase()) < 0) {		// jämför en bok med book min
						index = j;																									// går till platsen j i vektorn
						min = reg.get(j);																							// min tilldelas minsta värdet
						
					}
					 
					
				}
				
				help [index] = true;				// när den har har hittat minsta boken markerar den bokens plats i vektorn med true
				temp.add(min);						// sparar minsta boken i arrayList
				
			}
			
			reg.clear();
				for (int i = 0; i < temp.size(); i++) {
					reg.add(temp.get(i));
					
				}
			
	}
	
	/** Presentera böcker */
	public String present() {						// presenterar böckerna
		StringBuilder sb = new StringBuilder();		// skapar stringbuilder
		for (int i = 0; i < reg.size(); i++) {		//for-loop går igenom alla böcker
			sb.append(reg.get(i).toString()+"\n");		// hämtar böckerna från registret i stringbuilder och omvandlar till strängar, tilldelas sb
			
		}
		
		return sb.toString();						// returnerar strängarna
	}
	
	/** Lägger till böcker i registret */
	public void addBook(Book book) {
		reg.add(book);
		sortAuthor();
		
	}
	
	/** Tar bort böcker från registret efter författarnamn */
	public void removeByAuthor(String author) {
		for (int i = 0; i < reg.size(); i++) {					// går igenom alla böcker, 
			if (author.toLowerCase().equals(reg.get(i).getAuthor().toLowerCase())) {		// om författaren hittas
				reg.remove(reg.get(i));							// ta bort den
			}
		}
	}
	
	/** Tar bort böcker efter titel */
	public void removeByName(String title) {
		for (int i = 0; i < reg.size(); i++) {				// går igenom alla böcker, börjar från sista plats, regsize-1 för att hålla oss inom de normala gränserna (1-X)
			if (title.toLowerCase().equals(reg.get(i).getTitle().toLowerCase())) {			// om författaren hittas
				reg.remove(reg.get(i));							// ta bort den
			}
		}
	}
	
	
	/** Tar bort böcker i registret */
	public void deleteBook(Book book) {
		reg.remove(book);
	}
	
	/** Söker efter specifik bok i registret */
	public String searchBook(String bookName) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < reg.size(); i++) {
			if(reg.get(i).getAuthor().toLowerCase().indexOf(bookName.toLowerCase())>=0 || reg.get(i).getTitle().toLowerCase().indexOf(bookName.toLowerCase())>=0) { // 1. hämtar bok 2. hämtar författare eller titel 3. konverterar versaler till gemener 4. vid sökning behöver inte hela namnet skrivas ut
				
				sb.append(reg.get(i).getAuthor()+"\n" +reg.get(i).getTitle() +  "\n");			// sparar resultatet i en sträng, hämtar bok och författare samt titel
			
				
			}
					
									
		}
		
			return sb.toString();							// omvandlar stringBuilder till String.
		
	}
	

	
	
	
	/** Läser registret från filen med namn fileName. */
public void readFromFile(String fileName) {
			// ... Se ledning för filhanteringen sist i uppgiften

			Scanner scan = null; // scanner objekt
			reg.clear();
			// Kollar om filen går att öppna. Om inte skriver ut fel och avlslutar
			// programmet
			try {
				// Hjälp variabler för namn och datum
				// Loopa genom hela filen. Sålänge som hasNext() == true -> finns mer
				// att läsa ur filen.
				scan = new Scanner(new File(fileName));
				while (scan.hasNextLine()) {
					
					Book book = new Book (scan.nextLine(), scan.nextLine());
					reg.add(book); // lägga in person i listan
				}

				scan.close(); // Stänga scanner
			} catch (FileNotFoundException e) {
				System.err.println("Filen kunde inte öppnas");
				System.exit(1);
			}

			
			
		}
		
		/** Sparar registret på fil med namnet fileName. */
		public void writeToFile(String fileName) {
			// ... Se ledning för filhanteringen sist i uppgiften

			PrintWriter out = null; // PrintWriter objekt

			// Kolla att filen går öppna
			try {
				out = new PrintWriter(new File(fileName));
			} catch (FileNotFoundException e) {
				System.err.println("File not found.\n");
				System.exit(1);
			}

			// Hjälpvariabel
			Book book;

			// Gå igenom genom hela listan
			for (int i = 0; i < reg.size(); i++) {
				book = reg.get(i); // hämtar bok på plats i
				out.println(book.getAuthor()+"\n"+book.getTitle()); // Skriver ut författare
											 
				
			}

			out.close(); // Stänger filen
		}
		
		
		
		
	}
	


