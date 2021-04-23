import se.lth.cs.window.SimpleWindow;

public class ShapeListTest {
	public static void main(String[] args) {
	    	SimpleWindow w = new SimpleWindow(600, 600, "ShapeListTest");
	    	ShapeList shapes = new ShapeList();
	    	shapes.insert(new Square(100, 300, 100));
	    	shapes.insert(new Triangle(400, 200, 100));
	    	shapes.insert(new Circle(400, 400, 50));
	    	shapes.insert(new Square(450, 450, 50));
	    	shapes.insert(new Square(200, 200, 35));
	    	shapes.draw(w);
	    	
	    	while(true) {
	    		w.waitForMouseClick();
	    		Shape shape = shapes.findHit(w.getMouseX(), w.getMouseY()); //skapar en variabel shape där vi hämtar ny position för en shape
	    		
	    		w.waitForMouseClick();
	    		
	    		if (shape != null) {
	    			w.waitForMouseClick();
	    			shape.moveToAndDraw(w, w.getMouseX(), w.getMouseY());
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		//användaren klickar på en av figurerna
	    		//användaren klickar på en ny  position
	    		//figuren flyttas till den nya  position
	    	}
	}
}