import se.lth.cs.window.SimpleWindow;

public class Circle  extends Shape {
	
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void  draw(SimpleWindow w) {
		w.moveTo(x+radius, y); //förflyttar mig från medelpunkten till cirkelns kant
		for (int i = 0; i <=  360; i++) {	//for-loop som går igenom hela cirkeln, från 0 till 360 grader
			double angle = Math.toRadians(i);	//omvandlar grader till radianer
			int newX = x+(int)Math.round(radius*Math.cos(angle));	//nytt värde tilldelas x-koordinaterna i hela cirkeln
			int newY = y+(int)Math.round(radius*Math.sin(angle));	//nytt värde tilldelas y-koordinaterna
			w.lineTo(newX, newY);
			
			
		}
		
		
		
	}
	
}
