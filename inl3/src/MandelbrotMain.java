
public class MandelbrotMain {
	
	public static void main(String[] args) {
		
		MandelbrotGUI gui = new MandelbrotGUI();	//skapar ny mandelbrotGUI
		Generator g = new Generator();
		
		while(true) {
			
		switch (gui.getCommand()) {			//switchar olika cases inom mandelbrotGUI via getCommand
		
		case MandelbrotGUI.RENDER:
			g.render(gui); //render ska ändra i fönstret gui
			break;
		
		case MandelbrotGUI.RESET:
			gui.resetPlane();
			gui.clearPlane();
			break;
		
		case MandelbrotGUI.QUIT:
			System.exit(0);
			break;
		
		case MandelbrotGUI.ZOOM:
			g.render(gui);
			break;
		}
		
		
		}
		
	}

}
