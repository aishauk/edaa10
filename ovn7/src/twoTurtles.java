import java.util.Random;
import java.util.Scanner;

import ovn8.Turtle;
import se.lth.cs.window.SimpleWindow;


public class twoTurtles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleWindow w = new SimpleWindow(600,600,"Square");
		Turtle t = new Turtle(w,250,250);
		Turtle t2 = new Turtle(w,350,350);
		t.penDown();
		t2.penDown();
		double distanceBetweenTurtles;
		double a= Math.abs(t.getX()-t2.getX());
		double b= Math.abs(t.getY()-t2.getY());
				
		distanceBetweenTurtles = Math.hypot(a, b);
		Random rand = new Random();

		
		while (distanceBetweenTurtles >= 50) {
			int rnd1 = 1 + rand.nextInt(10);
			int rnd2 = 1 + rand.nextInt(10);
			int rnd3 = 1 + rand.nextInt(359);
			int rnd4 = 1 + rand.nextInt(359);
			t.forward(rnd1);
			t.left(rnd3);
			t2.forward(rnd2);
			t2.left(rnd4);
			w.delay(10); 		// vänta 10 millisekunder efter varje ritning
			a= Math.abs(t.getX()-t2.getX());
			b= Math.abs(t.getY()-t2.getY());
			distanceBetweenTurtles = Math.hypot(a, b);
			
		
		}
		
		System.out.println("done");
	}

}
