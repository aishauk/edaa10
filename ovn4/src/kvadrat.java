import java.util.Scanner;
import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;

public class kvadrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleWindow w = new SimpleWindow(600,600,"Square");
		Turtle t = new Turtle(w,100,200);
		t.penDown();
			
			
			
			while (true) {							// upprepa i evighet (se nedan)
				w.waitForMouseClick();				// vänta på musklick
				//w.getMouseX();						// tag reda på x för musklicket
				//w.getMouseY();						// tag reda på y för musklicket
				t.jumpTo (w.getMouseX(), w.getMouseY());
					for (int k=1; k<=4; k++) {		// rita kvadraten
					t.right(90);
					t.forward(300);
				}									
				
			
			}
				
				
		
		

	}

}
