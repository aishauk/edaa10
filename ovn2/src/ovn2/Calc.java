package ovn2;

import java.util.Scanner;

public class Calc {

	Scanner scan = new Scanner(System.in);
	int bigSum = 0;
	int lessSum = 0;
	int restDigits = scan.nextInt();
	
	for (int i = 0; i <=10; i++) {
		System.out.println("Mata in 11 tal: ");
		int firstDigit = scan.nextInt();
			if (firstDigit > restDigits) {
				bigSum = bigSum + restDigits;
		}
			else if (firstDigit < restDigits) {
				lessSum = lessSum + restDigits;
			}
	}
	
System.out.println("Summan av tal större än det första talet: " +bigSum);
System.out.println("Summan av tal mindre än det första talet: " +lessSum);

}
