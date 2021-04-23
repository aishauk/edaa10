import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr2.*;

public class Chiffertext {
	public static void main(String[] args) {
		
		
		TextWindow tw = new TextWindow("Decryptographer");
		TextView tv1  =  new TextView("Chiffertext", 10, 80);
		TextView tv2  =  new TextView("Min klartext", 10, 80);
		TextView tv3  =  new TextView("Korrekt klartext", 10, 80);
		Decryptographer  dc  = new  Decryptographer(new Key());
		
		tw.addView(tv1);
		tw.addView(tv2);
		tw.addView(tv3);
		
		TestCase tc = new TestCase();
		
		for(int i = 0; i<5; i++) {
			tv1.displayText(tc.getCryptoText(i));
			tv3.displayText(tc.getClearText(i));
			tv2.displayText(dc.decrypt(tc.getCryptoText(i))); //textview <- text  från decrypto <- testcase
			tw.waitForMouseClick();
			tv1.clear();
			tv3.clear();
			tv2.clear();
			
			if(i==4)  i=0;
			
		}
		
	

		}
		

	
	
}
