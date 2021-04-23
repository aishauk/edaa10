package ovn8;
import se.lth.cs.window.SimpleWindow;

public class TurtleRace {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SimpleWindow w = new SimpleWindow(500, 500, "race");
		RaceTrack track = new RaceTrack(400, 100);
		track.draw(w);
		Turtle t1 =  new Turtle(w, 0, 0);				// startvärden i deklaration, riktig position finns i  klassen RacingEvent
		Turtle t2 = new Turtle(w, 0, 0);
		RacingEvent rtEvent = new RacingEvent(track, t1, t2);
		
		
		/** Tävling påbörjas  när användaren trycker på musknappen */
		
		w.waitForMouseClick();
		rtEvent.StartRace();
		
	}

}
