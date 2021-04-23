import java.awt.Color;
public class Generator {
	
	
	
	/** Ritar en bild i fönstret i användargränssnittet gui */
	public void render(MandelbrotGUI gui) {
		gui.disableInput();  		// knapparna i anv.gränssnittet reagerar inte på tryck, beräkningarna störs ej av att anv gör op i  fönstret
		
		int res = 1;
	
		switch (gui.getResolution()) {
		
		case MandelbrotGUI.RESOLUTION_VERY_HIGH:
			res = 1;
			break;
		
		case MandelbrotGUI.RESOLUTION_HIGH:
			res = 3;
			break;
			
		case MandelbrotGUI.RESOLUTION_MEDIUM:
			res = 5;
			break;
			
		case MandelbrotGUI.RESOLUTION_LOW:
			res = 7;
			break;
			
		case MandelbrotGUI.RESOLUTION_VERY_LOW:
			res = 9;
			break;
		}
		
		
		Complex[][] complex = mesh(gui.getMinimumReal(), gui.getMaximumReal(), gui.getMinimumImag(), gui.getMaximumImag(), gui.getWidth(), gui.getHeight());
		//Complex[][] complex = mesh(gui.getMinimumImag(), gui.getMaximumImag(), gui.getMinimumReal(), gui.getMaximumReal(), gui.getHeight(), gui.getWidth());
		//åberopar alla egenskaper som finns i fönstret, lägger till i matrisen
		
		Color[][] picture = new Color[gui.getHeight()/res][gui.getWidth()/res];		//skapar en färgmatris, delar med resolution
		Color[] color = {Color.white, Color.RED, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PINK};	//deklarerar färger  som ska finnas i mitt färgmatris
			for (int i = 0; i < picture.length; i++) {								// går igenom raderna (height)
				for (int j  =  0; j < picture[i].length; j++) {						// går igenom kolumnerna (width), picture[i] <- i motsvarar rader
					//Complex c = complex[res/2+i*res][res/2+j*res];
					Complex c = complex[i*res][j*res];								// varje pixel får en färg
					
					int it = 0;														// deklarerar värde för iterationer (repeterar beräkningar enl regler)
					
					Complex z = new Complex(0,0);									// deklarerar ett nytt komplex-värde i width och height
					
					while (it < 200 && z.getAbs2() <= 4) {				// iterationer pågår 200 ggr samt som absolutvärdet för komplexa talet är max 4
						it++;			//räknar iterationerna uppåt
						z.mul(z);		//multiplicerar med sig självt
						z.add(c);  		//adderar komplext tal med ett annat komplext tal C	
					
					}
					
					if (it < 200) {
						
						switch (gui.getMode()) {
						
						case MandelbrotGUI.MODE_COLOR:
							if (it > 40) {
								picture[i][j] = color [1];
							} else if (it < 9) {
								picture[i][j] = color [5];
							} else if (it < 15) {
								picture[i][j]  = color [3];
							} else if (it < 27) {
								picture[i][j] = color [4];
							} else {
								picture[i][j] = color [5];
							}
							break;
							
						case MandelbrotGUI.MODE_BW:
							picture[i][j] = Color.WHITE; 
							break;
						
						} 
						
					} 
					
					else {
						picture[i][j] = Color.black;
					} 
					
					/**if (it < 200)
						picture [i][j] = Color.black; */
				}
			}
		
		gui.putData(picture, res, res);
		gui.enableInput();
		
	}
	
	
	
	/** Skapar en matris där varje element är ett komplext tal som
	har rätt koordinater (se beskrivning nedan) */
	private Complex[][] mesh(double minRe, double maxRe, double minIm, double maxIm, int width, int height) {
		Complex [][] complex  = new Complex[height][width];
		
		double imPlan =(maxIm-minIm)/(height-1); 				//Imaginärplan, height = MaxIm - MinIm
		double rePlan = (maxRe - minRe)/(width-1);				//Realplanet, width = MaxRe - MinRe
						
		for(int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				complex [i][j] = new Complex(minRe+j*rePlan, maxIm-i*imPlan);		//deklarerar ny complex som ska gå igenom varje pixel i matrisen	
			}																		//minRe & maxIm -  startpositioner i diagrammet
	}
	return complex;
	}
	
		
	

}
