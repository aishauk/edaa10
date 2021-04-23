package ovn8;
import se.lth.cs.window.SimpleWindow;

public class Turtle {
	
	private boolean penUp;
	private SimpleWindow window;
	private double x;
	private double y;
	private double angle;
	
 
  /** skapar en sk�ldpadda som ritar i ritf�nstret w. 
      Fr�n b�rjan befinner sig sk�ldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt upp�t i f�nstret, dvs i negativ y-riktning  
  */
  Turtle(SimpleWindow w, int xHome, int yHome) {
	  penUp  =  true;
	  window = w;
	  x = xHome;
	  y =  yHome;
	  angle = 90;
  }

  /** s�nker pennan */
  void penDown() {
	  penUp = false;
	  
  }

  /** lyfter pennan */
  void penUp() {
	  penUp  = true;
  }

  /** g�r rakt fram�t n pixlar i huvudets riktning */
  void forward(int n) {
	  
	  window.moveTo((int)Math.round(x), (int)Math.round(y));			// bestämmer simpleWindows pennas läge från  början  (börjar på turtle)
	  
	  x = x + n*(Math.cos(angle*Math.PI/180));
	  y  = y - n*(Math.sin(angle*Math.PI/180));

	  if (penUp == false) {
		  window.lineTo((int)Math.round(x), (int)Math.round(y));			// ritar linje
	  }
	  
	  
  }

  /** vrider huvudet beta grader �t v�nster */
  void left(int beta) {

	  angle  = angle+beta;				// enhetscirkeln: vinkeln ökar (till vänster)
  }

  /** vrider hvudet beta grader �t h�ger */
  void right(int beta) {

	  angle =  angle-beta;			// enhetscirkeln: vinkeln minskar (till höger)
  }

  /** g�r till punkten newX,newY utan att rita. 
      Pennans l�ge och huvudets riktning p�verkas inte */
  void jumpTo(int newX, int newY) {

	  x = newX;								// tilldelar nytt värde till x-koordinaten
	  y =  newY;							// tilldelar nytt värde till y-koordinaten
	 
  }

  /** �terst�ller huvudets riktning till den ursprungliga */
  void turnNorth() {
	  angle = 90;
  }

  /** tar reda p� sk�ldpaddans aktuella x-koordinat */
  int getX() {
	  
	  return (int) Math.round(x);				// omvandlar från double till int mha parentes
	  
  }

  /** tar reda p� sk�ldpaddans aktuella y-koordinat */
  int getY() {
	  
	  return (int) Math.round(y);
  }
}
