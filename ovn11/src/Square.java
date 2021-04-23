import se.lth.cs.window.SimpleWindow;

public class Square extends Shape {
	
	private int side;
	
	
	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}
	
	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x+side, y); 				//drar en linje från utg åt höger
		w.lineTo(x+side, y+side);			//står kvar på x+side, rör mig neråt i y-led
		w.lineTo(x, y+side); 				//går tillbaka till x:s ursprungsläge, står kvar i y-led
		w.lineTo(x, y);						//går tillbaks till ursprungsläget
		
	}
	
	
}
