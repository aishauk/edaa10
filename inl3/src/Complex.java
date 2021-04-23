
public class Complex {
	
	private double re;
	private double im;
	
	/**  Skapar en komplex variabel med realdelen re och imaginärdelen im */
	public Complex(double re,  double im) {
		
		this.re = re;
		this.im  = im;
	
	}

	/** Tar reda på realdelen */
	public double getRe() {
		return re;
		
	}
	
	/** Tar reda på imaginärdelen */
	public double getIm() {
		return im;
		
	}
	
	/** Tar reda på talets absolutbelopp i  kvadrat */
	public double getAbs2() {
		
		return (Math.pow(re, 2) +  Math.pow(im, 2));
		
	}
	
	/**  Adderar det komplexa talet c till detta tal */
	public void add(Complex c) {
		im += c.getIm();
		re += c.getRe();
	}
	
	/** Multiplicerar detta tal med det komplexa talet c */
	public void mul(Complex c) {
		
		//(Re1 + Im1i)(Re2 + Im2i) = Re1*Re2 -  Im1Im2  + i(Re1*Im2 + Re2*Im1)
		
		//double tempRe =  re*c.getRe()-im*c.getIm();
		//im = im*c.getRe()+re*c.getIm();
		//re =  tempRe;
		
		double reTemp = re * c.getRe()  - im * c.getIm();		// tillfälligt värde tilldelas re i form av reTemp
		double imTemp = re * c.getIm() + c.getRe() *  im;
		
		re = reTemp;
		im  = imTemp;
		
		
	}
	
}
