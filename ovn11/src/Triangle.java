import se.lth.cs.window.SimpleWindow;

public class Triangle extends Shape {

	private int side;
	
	protected Triangle(int x, int y, int side) {
		super(x, y);
		this.side =  side;
	}
	
	
	
	public void draw(SimpleWindow w) {
		
		w.moveTo(x, y);
		w.lineTo(x+side, y);		//står kvar i y-led, rör mig högerut i x-led
		w.lineTo(x+side, y-side);	//står kvar i x+side, rör mig uppåt i y-led
		w.lineTo(x, y);
		
	}
	
	
	
	
	

}
