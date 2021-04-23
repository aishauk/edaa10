package ovn8;
import se.lth.cs.window.SimpleWindow;

public class RaceTrack {

	
		// TODO Auto-generated method stub

		private int yStart;
		private int yFinish;

		/** Skapar en kapplöpningsbana. yStart och yFinish är y-koordinaterna för start- och mållinje */
		RaceTrack(int yStart, int yFinish) {

			this.yStart = yStart;				
			this.yFinish = yFinish;
		}

		/** Ritar kapplöpningsbanan i fönstret w */
		void draw(SimpleWindow w) {
			w.moveTo(50, yFinish);			// mållinje, hoppar till koordinaterna
			w.lineTo(400, yFinish);			// ritar mållinje
			
			w.moveTo(50, yStart);
			w.lineTo(400, yStart);			// startlinje
		}

		
		/** Metod för att hämta värden för yStart och  yFinish  */
		
		public  int  getStart() {
			return yStart;
		}

		public  int getFinish() {
			return yFinish;
		}

	}


