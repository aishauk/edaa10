package ovn8;
import java.util.Random;

import se.lth.cs.window.SimpleWindow;

public class RacingEvent {

	private Turtle t1,  t2;			// deklarerar sköldpaddorna
	private RaceTrack track;
	private Random rnd;

/** Skapar ett lopp mellan sköldpaddorna t1och t2 */
	RacingEvent(RaceTrack track, Turtle t1, Turtle t2) {
		
		this.t1 = t1;				// åberopar attributen i konstruktorn så att de kan användas i huvudprogrammet
		this.t2 =  t2;
		this.track = track;
		this.rnd = new Random();
		
	}


/** Skapar loppet */
	void StartRace() {
		
		t1.jumpTo(150, track.getStart());
		t2.jumpTo(250, track.getStart());
		
		while ((t1.getY()) > track.getFinish() && t2.getY() > track.getFinish()) {
		
			t1.penDown();
			t2.penDown();
			t1.forward(rnd.nextInt(3));	
			t2.forward(rnd.nextInt(3));
			SimpleWindow.delay(10);	 			// fördröjning när sköldpaddorna tagit ett steg
			
		}
			
		
	}
	
}