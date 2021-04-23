import java.util.ArrayList;

import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	
	private ArrayList<Shape> shapeList;
	

	/** Skapar en tom lista  */
	ShapeList() {
		shapeList = new ArrayList<Shape>();
	}
	
	/** Lägger in  figuren s  i listan */
	void insert(Shape  s) {
		shapeList.add(s);		//metod för att lägga till variabeln i listan
	
	}
	
	/** Ritar  upp figurerna i listan i fönstret w  */
	void draw(SimpleWindow w) {
		for (int i = 0; i < shapeList.size(); i++) {		//for-loop som går igenom alla shapes
			shapeList.get(i).draw(w); 						//hämtar figuren och ritar i fönstret
		}
		
	}
	
	/** Tar reda på en figur som ligger nära punkten xc,yc; 
	 ger null om ingen sådan figur  finns i listan */
	Shape findHit(int xc, int  yc) {
		
		for (int i =  0; i < shapeList.size(); i++) {		//går igenom alla shapes
			if (shapeList.get(i).near(xc, yc)) {			//om figuren nära xc, yc
				return shapeList.get(i);					//returnera figur
			}
		}
		
		return null;
		
	}
}
